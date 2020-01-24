/***************************************************
 * 
 *     1. Tipos y conversiones (2 puntos)
 * 
 **************************************************/

public class Respuesta1 {

//Argumenta por que esto imprime 'T'.
{
    char a;
    int b=97;
    int c=255;
    float d=84.1234567F;

    a=(char)b;
    a=(char)c;
    a=(char)d;
   
    System.out.println(a);
}
/*
RESPUESTA:
La variable a se ha declarado tipo char y la d como float,
posteriormente a d se le asigna un decimal valor= 84.123...
y en el último paso se asigna a a el valor de d pero aplicandole un casting 
que la convierte a char. El tipo char contiene un entero asociado al valor ASCII 
de un caracter, por lo que la asignación a = (char)d solo toma en cuenta la parte
entera de d, es decir 84 que es precisamente el código correspondiente a T
*/

//El siguiente codigo da un error de compilación.
//   "possible lossy conversion from float to char".
//Corrigelo...

{
char a;
int b=97;
int c=255;
float d=84.1234567F;    

a=(char)b;
a=(char)c;
// error: a=d;  
a=(char)d;  //corregido a tomará el valor 84 osea T

System.out.println(a);
}

//Argumenta por que el siguiente código escribe 97.00
{
    char a='a';
    double  d=a;
    System.out.println(d);
}
/*
RESPUESTA:
un tipo char como el de la variable a contiene en última instancia un valor 
entero de dos bytes; en este caso el valor de a se corresponde con el código ASCII 97.
Por otra parte en una asignación, si la variable receptora tiene espacio suficiente, se
le puede asignar un valor de tipo diferente, realizandose en este caso, un casting o
cambio de tipo automatico.
Aquí la variablle receptora d es de tipo double que tiene espacio de sobra para admitir un valor
entero de 97 que pasará a ser double y por tanto al representarse en consola se mostrará como 97.0
*/

}