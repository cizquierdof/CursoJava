import java.util.ArrayList;

class EjercicioArrayList {

    public static void main(String[] args) {

        ArrayList<Coches> miGaraje = new ArrayList<Coches>(); // ArrayList para lamacenar mi garaje

        // Coches en el escaparate de la tienda
        Coches coche1 = new Coches("3452JJJ", "Audi", "X5");
        Coches coche2 = new Coches("2214HKI", "Mazda", "MX-5");
        Coches coche3 = new Coches("3452JJJ", "Suzuki", "Jimny");
        Coches coche4 = new Coches("4315JKH", "Dacia", "Sandero");
        Coches coche5 = new Coches("2110HFJ", "Kia", "Sportage");

        // Adquisición de los dos primeros coches
        miGaraje.add(coche1);
        miGaraje.add(coche2);

        // Listado de mi garaje actual
        System.out.println("Primera compra de coches:");
        listadoMiGaraje(miGaraje);

        // adquisición de un nuevo coche
        miGaraje.add(coche3);

        // Ahora mi garage contiene
        System.out.println("\nCompro un nuevo coche: ");
        listadoMiGaraje(miGaraje);

        // Compro un coche más y cambio el Suzuki por el Kia
        miGaraje.add(coche4);
        miGaraje.set(2, coche5);

        // El resultado de los cambios es:
        System.out.println("\nCompro otro coche y cambio el tercer coche");
        listadoMiGaraje(miGaraje);

        // Por último me canso del Audi y lo vendo
        miGaraje.remove(0);

        // Finallmente el garaje queda
        System.out.println("\nMe deshago del primer coche:");
        listadoMiGaraje(miGaraje);

    }
// función que lista en terminal todos los elementos del garaje
    static public void listadoMiGaraje(ArrayList<Coches> m) {
        for (int i = 0; i < m.size(); i++) {
            System.out.println(m.get(i));
        }
    }
    
}
