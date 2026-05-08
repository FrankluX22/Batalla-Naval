package modelo;

public class Tablero {
    private char[][] tablero;
    private static final int TAMANIO = 10;

    public Tablero() {
        tablero = new char[TAMANIO][TAMANIO];// Inicializa el tablero con agua
        inicializarTablero();
    }

    private void inicializarTablero() {
        // Llena el tablero con el símbolo de agua '~'
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                tablero[i][j] = '~'; // Representa agua
            }
        }
    }

    public void mostrarTablero() {
        // Imprimir números de columna (1-10)
        System.out.print("   ");
        for (int col = 1; col <= TAMANIO; col++) {
            System.out.printf("%2d", col);
        }
        System.out.println();

        // Imprimir cada fila con su letra (A-J)
        for (int fila = 0; fila < TAMANIO; fila++) {
            char letra = (char) ('A' + fila);
            System.out.print(letra + "  ");

            for (int col = 0; col < TAMANIO; col++) {
                System.out.printf("%2c", tablero[fila][col]);
            }
            System.out.println();
        }
    }

    public boolean colocarBarco(int fila, int col, int tamanio, boolean esHorizontal) {
        // Primero, verifica si el barco cabe en el tablero
        if (esHorizontal && col + tamanio > TAMANIO) return false; // El barco no cabe horizontalmente
        if (!esHorizontal && fila + tamanio > TAMANIO) return false; // El barco no cabe verticalmente

        // Luego, verifica si el espacio está libre
        for (int i = 0; i < tamanio; i++) {
            int f = esHorizontal ? fila : fila + i; // Fila para barco vertical
            int c = esHorizontal ? col + i : col; // Columna para barco horizontal
            if (tablero[f][c] != '~') return false; // El espacio no está libre
        }

        // Coloca el barco en el tablero
        for (int i = 0; i < tamanio; i++) {
            int f = esHorizontal ? fila : fila + i; // Fila para barco vertical
            int c = esHorizontal ? col + i : col; // Columna para barco horizontal
            tablero[f][c] = 'B'; // Representa un barco
        }

return true;
    }

    public boolean disparar(int fila, int col) {
        if (tablero[fila][col] == 'B') {
            tablero[fila][col] = 'X';
            return true;
        } else {
            tablero[fila][col] = 'O';
            return false;
        }
    }

    public boolean puedeDisparar(int fila, int col) {
        return tablero[fila][col] == '~' || tablero[fila][col] == 'B';
    }

    public char getCelda(int fila, int col) {
        return tablero[fila][col];
    }

    public void mostrarTableroOculto() {
        System.out.print("   ");
        for (int col = 1; col <= TAMANIO; col++) {
            System.out.printf("%2d", col);
        }
        System.out.println();

        for (int fila = 0; fila < TAMANIO; fila++) {
            char letra = (char) ('A' + fila);
            System.out.print(letra + "  ");

            for (int col = 0; col < TAMANIO; col++) {
                char celda = tablero[fila][col];
                if (celda == 'B') {
                    System.out.print("~ ");
                } else {
                    System.out.printf("%2c", celda);
                }
            }
            System.out.println();
        }
    }
}