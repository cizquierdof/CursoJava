public class Rectangulo{
    private double largo;
    private double ancho;
    
    //getters
    public double getAncho(){
        return ancho;
    }
     public double getLargo(){
        return largo;
    }   
    
    //constructor
    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    //devuelve si es cuadrado o no
    public boolean esCuadrado(){
        return largo == ancho;
    }
    
    public String toString(){
        return "Largo: " + largo + " Ancho: " + ancho;
    }
    
    public double area(){
        return largo*ancho;
    }
    
    public int compareTo(Rectangulo rectangulo){
        
        if(this.area()<rectangulo.area()){
            return 1;
        } else if(this.area()>rectangulo.area()){
            return 1;
        } else {
            return 0;
        }
    }
}