import modelo.Tablero;
import java.util.ArrayList;
import java.util.Stack;

public class Jugador {
    private final String nombre;
    private final Tablero tablero;
    private final ArrayList<Barco>barcos;
    private  Stack<String>historialDisparos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.tablero = new Tablero();
        this.barcos = new ArrayList<>();
        this.historialDisparos = new Stack<>();
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