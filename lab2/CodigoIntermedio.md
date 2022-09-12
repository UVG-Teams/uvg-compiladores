# Diseño código intermedio

El código de tres direcciones está diseñada para la evaluación de operaciones aritméticas y tiene la forma: 
$$
x = y \text{ op } z
$$

Las propociciones que pueden existir en nuestro codigo de tres direcciones son:
  * Asignaciones Binarias
    * $a = b \text{ op } c$
  * Asignaciones Unarias
    * $a = -b$
  * Instrucciones de copia por valor
    * $a=b$
  * Instrucciones de copia por referencia
    * $a = c[b]$
    * $c[b] = a$
  * Saltos incondicionales
    * $\text{ goto } B1$
  * Saltos condicionales
    * $if(a) \text{ goto } B1$
    * $if(a<b)  \text{ goto } B1$
    * $if(a<b or c>d)  \text{ goto } B1$
    * Nota: misma manera para ciclos while y for
  * Llamadas a funciones
    * $\text{ call } funcion(a,b,...n)$
    * $a = call