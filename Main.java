/**
 * Batalla Naval - Prueba de HU-04: Tablero Oculto
 */

public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== PRUEBA HU-04: TABLERO OCULTO ===");
        System.out.println();
        
        // Crear tablero de la maquina (enemigo)
        Tablero tableroEnemigo = new Tablero();
        
        // Colocar barcos de prueba
        System.out.println("1. Colocando barcos enemigos...");
        tableroEnemigo.colocarBarco(0, 0, 5, true);  // Portaaviones en A1-E1
        tableroEnemigo.colocarBarco(5, 2, 4, false); // Acorazado en C6-C9
        
        System.out.println("\n2. Mostrando tablero NORMAL (con barcos visibles):");
        System.out.println("   (Este es TU tablero, vos decis cuando mostrar esto)");
        System.out.println();
        tableroEnemigo.mostrarTablero();
        
        System.out.println("\n3. Mostrando tablero OCULTO (enemigo):");
        System.out.println("   (Los barcos deberian aparecer como ~)");
        System.out.println();
        tableroEnemigo.mostrarTableroOculto();
        
        System.out.println("\n4. Haciendo disparos...");
        System.out.println("   Disparo en A1 (deberia ser IMPACTO): " + tableroEnemigo.disparar(0, 0));
        System.out.println("   Disparo en A5 (deberia ser AGUA): " + tableroEnemigo.disparar(0, 4));
        System.out.println("   Disparo en C6 (deberia ser IMPACTO): " + tableroEnemigo.disparar(5, 2));
        
        System.out.println("\n5. Tablero OCULTO despues de disparos:");
        System.out.println("   (A1 y C6 deberian mostrar X, A5 deberia mostrar O)");
        System.out.println();
        tableroEnemigo.mostrarTableroOculto();
        
        System.out.println("\n6. Tablero NORMAL despues de disparos:");
        System.out.println("   (Para comparar - vos ves los barcos y los impactos)");
        System.out.println();
        tableroEnemigo.mostrarTablero();
        
        System.out.println("\n7. Verificando puedeDisparar()...");
        System.out.println("   puedeDisparar(0,1)? " + tableroEnemigo.puedeDisparar(0, 1) + " (deberia ser true)");
        System.out.println("   puedeDisparar(0,0)? " + tableroEnemigo.puedeDisparar(0, 0) + " (deberia ser false - ya disparamos)");
        System.out.println("   puedeDisparar(0,4)? " + tableroEnemigo.puedeDisparar(0, 4) + " (deberia ser false - ya disparamos)");
        
        System.out.println("\n=== FIN DE LA PRUEBA ===");
    }
    
}