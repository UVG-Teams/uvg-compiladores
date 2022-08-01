# Sistema de Tipos
Ø (): (En cualquier ámbito, en el ámbito global)</br>
Γ (Gamma): ambito (En un ámbito en particular)</br>
⊢ (Trinquete): a la derecha del trinquete es estrictamente verdadero </br>

Γ ⊢ M : A </br> 
M: Variable </br> 
A: Tipo de dato </br> </br> 

En el ambito gamma es estrictamente verdadero que la variable M es de tipo A.</br> 

## Tipos de datos
## Reglas de ámbito

## Reglas de tipos
### Operaciones entre int

$$
Γ ⊢ a: int \\
{Γ ⊢ b: int \over a + b: int}
$$


```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H[+]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[5];
      E --- G[11];
      
      A -.-|int| A;
      B -.-|int| B;
      C -.-|int| C;
      D -.-|int| D;
      E -.-|int| E;
      F -.-|int| F;
      G -.-|int| G;
```


$$
Γ ⊢ a: int \\
{Γ ⊢ b: int \over a - b: int}
$$

```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H[-]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[5];
      E --- G[11];
      
      A -.-|int| A;
      B -.-|int| B;
      C -.-|int| C;
      D -.-|int| D;
      E -.-|int| E;
      F -.-|int| F;
      G -.-|int| G;
```

$$
Γ ⊢ a: int \\
{Γ ⊢ b: int \over a * b: int}
$$

```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H[*]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[5];
      E --- G[11];
      
      A -.-|int| A;
      B -.-|int| B;
      C -.-|int| C;
      D -.-|int| D;
      E -.-|int| E;
      F -.-|int| F;
      G -.-|int| G;
```

$$
Γ ⊢ a: int \\
{Γ ⊢ b: int \over a / b: int}
$$

```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H["/"]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[5];
      E --- G[11];
      
      A -.-|int| A;
      B -.-|int| B;
      C -.-|int| C;
      D -.-|int| D;
      E -.-|int| E;
      F -.-|int| F;
      G -.-|int| G;
```

</br>
</br>

### Operaciones entre string

$$
Γ ⊢ a: str \\
{Γ ⊢ b: str \over a + b: str}
$$


```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H[+]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[G];
      E --- G[L];
      
      A -.-|str| A;
      B -.-|str| B;
      C -.-|str| C;
      D -.-|str| D;
      E -.-|str| E;
      F -.-|str| F;
      G -.-|str| G;
```


$$
Γ ⊢ a: str \\
{Γ ⊢ b: str \over a - b: ERROR}
$$

```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H[-]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[G];
      E --- G[L];
      
      A -.-|ERROR| A;
      B -.-|str| B;
      C -.-|str| C;
      D -.-|str| D;
      E -.-|str| E;
      F -.-|str| F;
      G -.-|str| G;
```

$$
Γ ⊢ a: str \\
{Γ ⊢ b: str \over a * b: ERROR}
$$

```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H[*]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[G];
      E --- G[L];
      
      A -.-|ERROR| A;
      B -.-|str| B;
      C -.-|str| C;
      D -.-|str| D;
      E -.-|str| E;
      F -.-|str| F;
      G -.-|str| G;
```

$$
Γ ⊢ a: str \\
{Γ ⊢ b: str \over a / b: ERROR}
$$

```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H["/"]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[G];
      E --- G[L];
      
      A -.-|ERROR| A;
      B -.-|str| B;
      C -.-|str| C;
      D -.-|str| D;
      E -.-|str| E;
      F -.-|str| F;
      G -.-|str| G;
```

</br>
</br>

### Operaciones entre int y string
$$
Γ ⊢ a: str \\
{Γ ⊢ b: int \over a + b: ERROR}
$$


```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H[+]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[G];
      E --- G[11];
      
      A -.-|ERROR| A;
      B -.-|str| B;
      C -.-|int| C;
      D -.-|str| D;
      E -.-|int| E;
      F -.-|str| F;
      G -.-|int| G;
```


$$
Γ ⊢ a: str \\
{Γ ⊢ b: str \over a - b: ERROR}
$$

```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H[-]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[5];
      E --- G[11];
      
      A -.-|ERROR| A;
      B -.-|str| B;
      C -.-|str| C;
      D -.-|str| D;
      E -.-|str| E;
      F -.-|str| F;
      G -.-|str| G;
```

$$
Γ ⊢ a: str \\
{Γ ⊢ b: str \over a * b: ERROR}
$$

```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H[*]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[5];
      E --- G[11];
      
      A -.-|ERROR| A;
      B -.-|str| B;
      C -.-|str| C;
      D -.-|str| D;
      E -.-|str| E;
      F -.-|str| F;
      G -.-|str| G;
```

$$
Γ ⊢ a: str \\
{Γ ⊢ b: str \over a / b: ERROR}
$$

```mermaid
  graph TD;
      A[E] --- B[E];
      A --- H["/"]
      A --- C[E];
      B --- D[N];
      C --- E[N];
      D --- F[5];
      E --- G[11];
      
      A -.-|ERROR| A;
      B -.-|str| B;
      C -.-|str| C;
      D -.-|str| D;
      E -.-|str| E;
      F -.-|str| F;
      G -.-|str| G;
```


Tipos de datos (int, bool, char, etc y sus posibles valores)

Reglas de ambito (Estatico o dinamico)
Ámbito estático
Reglas de tipos



