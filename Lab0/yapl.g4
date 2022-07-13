grammar yapl;


// Definicion lexica

// KEYWORDS
CLASS: 'class' | 'CLASS';
ELSE: 'else' | 'ELSE';
FALSE: 'false';
FI: 'fi' | 'FI';
IF: 'if' | 'IF';
IN: 'in' | 'IN';
INHERITS: 'inherits' | 'INHERITS';
ISVOID: 'isvoid' | 'ISVOID';
LOOP: 'loop' | 'LOOP';
POOL: 'pool' | 'POOL';
THEN: 'then' | 'THEN';
WHILE: 'while' | 'WHILE';
NEW: 'new' | 'NEW';
NOT: 'not' | 'NOT';
TRUE: 'true';
LET: 'let';

// EOF: '\0';
SELF: 'self';
SELF_TYPE: 'SELF_TYPE';
KEYWORDS: (CLASS|ELSE|FALSE|FI|IF|IN|INHERITS|ISVOID|LOOP|POOL|THEN|WHILE|NEW|NOT|TRUE);
TYPE_ID: [A-Z][a-zA-Z0-9]+;
OBJECT_ID: [a-z][a-zA-Z0-9]+;
// ID: TYPE_ID | OBJECT_ID ;
STRING: '"' (~'"' (~'\n')*)* '"';
WHITESPACE: (' '|'\n'|'\f'|'\r'|'\t') -> skip;
NEWLINE: [\r\n]+ -> skip;
INT: [0-9]+;
// COMMENT: '--' (~'\n')* NEWLINE -> skip;
// COMMENT_BLOCK: '(*' (~'*(' (~'\n')*)* '*)' -> skip;
COMMENT: '--' .*? NEWLINE -> skip;
COMMENT_BLOCK: '(*' .*? '*)' -> skip;




// Definicion sintatica
expr: (TYPE_ID | OBJECT_ID) '<-' expr
    | expr ('@' TYPE_ID)? '.' (TYPE_ID | OBJECT_ID) '(' ( expr (';' expr)* )? ')'
    | (TYPE_ID | OBJECT_ID) '(' (expr (',' expr)*)? ')'
    | IF expr THEN expr ELSE expr FI
    | WHILE expr LOOP expr POOL
    | '{' (expr ';')+ '}'
    | LET (TYPE_ID | OBJECT_ID) ':' TYPE_ID ('<-' expr)? ( ',' (TYPE_ID | OBJECT_ID) ':' TYPE_ID ( '<-' expr )? )* IN expr
    | NEW TYPE_ID
    | ISVOID expr
    | expr ('+'|'-') expr
    | expr ('*'|'/') expr
    | '-' expr
    | expr ('<'|'<=') expr
    | expr '=' expr
    | NOT expr
    | '(' expr ')'
    | (TYPE_ID | OBJECT_ID)
    | INT
    | STRING
    | TRUE
    | FALSE
    ;

formal: (TYPE_ID | OBJECT_ID) ':' TYPE_ID;

feature: (TYPE_ID | OBJECT_ID) ('(' (formal ( ',' formal)*)? ')')? ':' TYPE_ID '{' expr '}'
    | (TYPE_ID | OBJECT_ID) ':' TYPE_ID ( '<-' expr )?;

class_def: CLASS TYPE_ID (INHERITS TYPE_ID)? '{' (feature ';')* '}';

prog: (class_def ';')+;
