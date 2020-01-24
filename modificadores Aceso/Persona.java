public class Persona {
    private String nombre;
    private int edad;
    private boolean tieneCarnet;

    Automovil[] misCoches;

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTieneCarnet(boolean tieneCarnet) {
        this.tieneCarnet = tieneCarnet;
    }

    // getters
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public boolean getTieneCarnet() {
        return this.tieneCarnet;
    }

    public void setAutomovil(Automovil[] a) {
        this.misCoches = a;
    }

    // calcula valor de los coches
    public double valorMisCoches() {
        double valor = 0;
        for (Automovil a : misCoches) {
            valor += a.getPrecio();
        }

        return valor;
    }

}