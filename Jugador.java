import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private Tablero tablero;
    private ArrayList<Barco>barcos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.tablero = new Tablero();
        this.barcos = new ArrayList<>();
    }

    public void agregarBarco(Barco barco) {
        barcos.add(barco);
    }

    public boolean todosHundidos() {
        for (Barco barco : barcos) {
            if (!barco.estaHundido()) return false;
        }
        return true;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public Tablero getTablero() {
        return tablero;
    }
    public ArrayList<Barco> getBarcos() {
        return barcos;
    }
}