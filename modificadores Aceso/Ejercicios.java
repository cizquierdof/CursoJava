class Ejercicios {

    public static void main(String[] args) {

        Persona carlos = new Persona();

        Automovil[] coches = new Automovil[4];

        
         for(int i=0;i<4;i++){ coches[i] =new Automovil(); }
        
        coches[0].setMatricula("3456HHH");
        coches[0].setMarca("BMW");
        coches[0].setModelo("X3");
        coches[0].setPrecio(37200);
        coches[1].setMatricula("2114KHJ");
        coches[1].setMarca("AUDI");
        coches[1].setModelo("e-Tron Sportback");
        coches[1].setPrecio(53160);
        coches[2].setMatricula("3548KKK");
        coches[2].setMarca("MAZDA");
        coches[2].setModelo("CX30");
        coches[2].setPrecio(25600);
        coches[3].setMatricula("V1024J");
        coches[3].setMarca("SEAT");
        coches[3].setModelo("PANDA");
        coches[3].setPrecio(500);

        carlos.setAutomovil(coches);

        System.out.println("Mi garage se compone de:");
        for (Automovil a : carlos.misCoches) {
            System.out.println(a);
        }

        System.out.println("Su valor total es: " + carlos.valorMisCoches());

    }

}
