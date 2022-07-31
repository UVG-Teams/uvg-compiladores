# Sistema de Tipos
Ø (): (En cualquier ámbito, en el ámbito global)</br>
Γ (Gamma): ambito (En un ámbito en particular)</br>
⊢ (Trinquete): a la derecha del trinquete es estrictamente verdadero </br>

Γ ⊢ M : A </br> 
M: Variable </br> 
A: Tipo de dato </br> </br> 

En el ambito gamma es estrictamente verdadero que la variable M es de tipo A.</br> 


$$
Γ ⊢ a: int \\
{Γ ⊢ b: int \over a + b: int}
$$

```mermaid
  graph TD;
      A-->B;
      A-->C;
      B-->D;
      C-->D;
```



Tipos de datos (int, bool, char, etc y sus posibles valores)

Reglas de ambito (Estatico o dinamico)
Ámbito estático
Reglas de tipos



