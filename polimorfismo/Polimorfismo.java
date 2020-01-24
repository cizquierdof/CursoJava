/******************
 * 
 * Ejemplo de polimorfismo creando objetos para una base de datos 
 * de animales
 ************************/
class Polimorfismo {

    public static void main(String[] args) {

        Animal perro = new Perro("Perro");

        //Array de animales. 
        Animal[] animales = new Animal[5];

        
        animales[0] = new Perro("Perro");
        animales[1] = new Lobo("Lobo");
        animales[2] = new Gato("Gato");
        animales[3] = new Leon("León");
        animales[4] = new Hipopotamo("Hipopotamo");

        for (Animal a : animales) {
            System.out.println(a.getNombreAnimal()+" "+a.deambula());
        }
    }

    //A continuación defino una serie de clases y subclases que heredan
    // todas de la clase Animal
    class Canino extends Animal{
        public Canino(String nombreAnimal) {
            super(nombreAnimal);
        }

        public String deambula() {
            return "Van en manada";
        }
    }

    class Felino extends Animal{
       
        public Felino(String nombreAnimal) {
            super(nombreAnimal);
            // TODO Auto-generated constructor stub
        }

        public String deambula() {
            return "En solitario";
        }
    }

    class Leon extends Felino{
        public Leon(String nombreAnimal) {
            super(nombreAnimal);
            // TODO Auto-generated constructor stub
        }

        public String sonido() {
            return "Ruge";
        }

        public String come(){
            return "Animales";
        }
    }

    class Gato extends Felino{
        public Gato(String nombreAnimal) {
            super(nombreAnimal);
            // TODO Auto-generated constructor stub
        }

        public String sonido() {
            return "Maulla";
        }

        public String come(){
            return "Ratones";
        }
    }

    class Perro extends Canino{
        public Perro(String nombreAnimal) {
            super(nombreAnimal);
            // TODO Auto-generated constructor stub
        }

        public String sonido() {
            return "Ladra";
        }

        public String come(){
            return "Pienso";
        }
    }

    class Lobo extends Canino{
        public Lobo(String nombreAnimal) {
            super(nombreAnimal);
            // TODO Auto-generated constructor stub
        }

        public String sonido() {
            return "Aulla";
        }

        public String come(){
            return "Animales";
        }
    }

    class Hipopotamo extends Animal{
        public Hipopotamo(String nombreAnimal) {
            super(nombreAnimal);
            // TODO Auto-generated constructor stub
        }

        public String sonido() {
            return "Ultrasonidos";
        }

        public String come(){
            return "Hierba";
        }
    }
}