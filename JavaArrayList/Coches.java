public class Coches{

    private String matricula;
    private String marca;
    private String modelo;
   

    //getters setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
//Constructor de la clase con todos los atributos
    public Coches(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coches [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + "]";
    }
}