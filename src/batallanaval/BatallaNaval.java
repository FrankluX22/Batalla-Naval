package batallanaval;

import modelo.*;
import util.GestorArchivos;
import vista.PanelTablero;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BatallaNaval {

    public static void main(String[] args) {
        // ========================================
        // PRUEBA 1: Modelo (consola)
        // ========================================
        System.out.println("=== Prueba de Compilacion ===");

        // 1. Probar modelo
        Jugador jugador = new Jugador("Usuario");
        Maquina maquina = new Maquina();

        // 2. Probar colocacion de barcos de la maquina
        maquina.colocarBarcosAleatorios();

        // 3. Probar tableros
        System.out.println("\nTablero del Jugador:");
        jugador.getTablero().mostrarTablero();

        System.out.println("\nTablero de la Maquina (oculto):");
        maquina.getTablero().mostrarTableroOculto();

        // 4. Probar disparo
        boolean impacto = maquina.getTablero().disparar(0, 0);
        System.out.println("\nDisparo en A1: " + (impacto ? "IMPACTO" : "AGUA"));

        // 5. Probar gestor de archivos
        GestorArchivos gestor = new GestorArchivos();
        gestor.guardarPuntaje("Test", true, 10);
        gestor.leerPuntajes();

        System.out.println("\n=== Compilacion exitosa ===");

        // ========================================
        // PRUEBA 2: PanelTablero (GUI Swing)
        // ========================================
        System.out.println("\n=== Iniciando prueba de GUI Swing ===");

        // Crear y mostrar la ventana de prueba
        SwingUtilities.invokeLater(() -> {
            // Crear ventana principal
            JFrame ventana = new JFrame("Prueba PanelTablero - Batalla Naval");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setLocationRelativeTo(null); // Centrar en pantalla

            // Crear el panel del tablero
            PanelTablero panel = new PanelTablero();

            // Agregar a la ventana
            ventana.add(panel);
            ventana.pack();
            ventana.setVisible(true);

            // ========================================
            // Datos de prueba para el tablero
            // ========================================
            // Crear un tablero de prueba con algunos datos
            char[][] prueba = new char[10][10];

            // Llenar con agua ('~')
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    prueba[i][j] = '~';
                }
            }

            // Agregar ejemplos de prueba:
            // Barcos (B) - se muestran en gris
            prueba[0][0] = 'B';
            prueba[0][1] = 'B';
            prueba[0][2] = 'B';
            prueba[0][3] = 'B';
            prueba[0][4] = 'B'; // Portaaviones (5)

            prueba[3][3] = 'B';
            prueba[3][4] = 'B';
            prueba[3][5] = 'B';
            prueba[3][6] = 'B'; // Acorazado (4)

            // Impactos (X) - se muestran en rojo
            prueba[1][1] = 'X';
            prueba[5][5] = 'X';

            // Agua disparada (O) - se muestra en azul oscuro
            prueba[2][2] = 'O';
            prueba[7][8] = 'O';
            prueba[9][0] = 'O';

            // Actualizar el panel con los datos de prueba
            // true = mostrar barcos (tablero propio)
            panel.actualizarTablero(prueba, true);

            System.out.println("GUI Swing iniciada correctamente.");
            System.out.println("Deberías ver un tablero 10x10 con botones de colores.");
        });
    }
}