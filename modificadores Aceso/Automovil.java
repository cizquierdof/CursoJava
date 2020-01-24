public class Automovil {
    private String matricula;
    private String marca;
    private String modelo;
    private double precio;

    // setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // getters
    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getPrecio() {
        return this.precio;
    }

    // función que devuelve el contenido del objeto en una string
    public String toString() {
        return "Matrícula: " + matricula + " Marca " + marca + " " + modelo + " " + precio + "€";
    }

}
