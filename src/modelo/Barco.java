public class Barco {
    private final  String nombre;
    private final int tamanio;
    private int impactos;

    // Constructor
    public Barco(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.impactos = 0;
    }
    // Método para registrar un impacto en el barco
    public void recibirImpacto() {
        impactos++;
    }
    // Método para verificar si el barco está hundido
    public boolean estaHundido() {
        return impactos >= tamanio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getTamanio() {
        return tamanio;
    }
    public int getImpactos() {
        return impactos;
    }
    
}