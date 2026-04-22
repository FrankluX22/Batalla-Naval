/**
 * Batalla Naval - Aplicación Principal
 * Juego de Batalla Naval en Java
 */

public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== BIENVENIDO A BATALLA NAVAL ===");
        System.out.println();
        
        
        Tablero tablero = new Tablero();
        tablero.colocarBarco(2, 3, 3, true); // Coloca un barco horizontal de tamaño 3 en la posición (2,3)
        tablero.mostrarTablero();

        System.out.println("---Disparo---");
        tablero.disparar(2, 3); // Dispara en la posición (2,3)
        System.out.println("---Disparo---");
        tablero.disparar(0, 0); // Dispara en la posición (0,0) - agua
        tablero.mostrarTablero();
    }
    
}
