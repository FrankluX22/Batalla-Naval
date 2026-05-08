import java.util.Random;

public class Maquina extends Jugador {
    private Random random;

    public Maquina() {
        super("Maquina");
        this.random = new Random();
    }

    public int[] generarDisparo(int tamanio) {
        int fila = random.nextInt(tamanio);
        int col = random.nextInt(tamanio);
        return new int[]{fila, col};
    }

    public void colocarBarcosAleatorios() {
        int[] tamanios = {5, 4, 3, 3, 2}; // Tamaños de los barcos
        String[] nombres = {"Portaaviones", "Acorazado", "Crucero", "Submarino", "Destructor"};

        for (int i = 0; i < tamanios.length; i++) {
            boolean colocado = false;
            while (!colocado) {
                int fila = random.nextInt(10);
                int col = random.nextInt(10);
                boolean esHorizontal = random.nextBoolean();
                colocado = getTablero().colocarBarco(fila, col, tamanios[i], esHorizontal);
                if (colocado) {
                    agregarBarco(new Barco(nombres[i], tamanios[i]));
                }
            }
        }
    }
}