package es.taes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Persona carlos = new Persona();
        carlos.setNombre("Carlos");
        carlos.setDni("24314086G");
        carlos.setEdad(58);

        System.out.println(carlos);
    }

    
}
