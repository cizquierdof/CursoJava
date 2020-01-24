    //superclase Animal
    class Animal{
        private String nombreAnimal;
        private String alimentacion;      //carnívoro o hervívoro
        private int hambre;     //entero indicando el nivel de hambre del animal

        public String getAlimentacion() {
            return alimentacion;
        }

        public void setAlimentacion(String alimentacion) {
            this.alimentacion = alimentacion;
        }

        public int getHambre() {
            return hambre;
        }

        public void setHambre(int hambre) {
            this.hambre = hambre;
        }

        //métodos de la clase animal
        
        public String sonido(){
            return "Sonido genérico";   
        }

        public String come() {
            return "Animal come";
        }

        public String duerme() {
            return "Duerme";
        }

        public String deambula() {
            return "Actividad indeterminada";
        }

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

    public Animal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }



    }