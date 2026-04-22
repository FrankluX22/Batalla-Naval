/**
 * Batalla Naval - Aplicación Principal
 * Juego de Batalla Naval en Java
 */

public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== BIENVENIDO A BATALLA NAVAL ===");
        System.out.println();
        
        // Prueba de tablero
        Tablero tablero = new Tablero();
        tablero.colocarBarco(2, 3, 3, true); // Coloca un barco horizontal de tamaño 3 en la posición (2,3)
        tablero.mostrarTablero();

        System.out.println("---Disparo---");
        tablero.disparar(2, 3); // Dispara en la posición (2,3)
        tablero.disparar(0, 0); // Dispara en la posición (0,0) - agua
        tablero.mostrarTablero();

        //Prueba de barco
        Barco barco = new Barco("Destructor", 2);
        
        System.out.println("Hundido: " + barco.estaHundido()); // Debería ser false

        barco.recibirImpacto();
        System.out.println("Hundido: " + barco.estaHundido()); // Debería ser false

        barco.recibirImpacto();
        System.out.println("Hundido: " + barco.estaHundido()); // Debería ser true

        // Prueba de jugador
        Jugador jugador = new Jugador("Franco");
        jugador.agregarBarco(new Barco("Destructor", 2));
        jugador.agregarBarco(new Barco("Crucero", 3));

        System.out.println("Todos hundidos: " + jugador.todosHundidos()); // Debería ser false

        // Simular maquina colocando barcos
        Maquina maquina = new Maquina();
        maquina.colocarBarcosAleatorios();
        System.out.println("Barcos de la maquina:");
        maquina.getTablero().mostrarTablero();

        // Prueba de gestor de archivos
        GestorArchivos gestor = new GestorArchivos();
        gestor.guardarPuntaje("Franco", true, 5); // Guarda un puntaje de victoria con 5 intentos
        gestor.guardarPuntaje("Juan", false, 10); // Guarda un puntaje de derrota con 10 intentos
        gestor.leerPuntajes(); // Lee y muestra los puntajes guardados
    }
    
}
