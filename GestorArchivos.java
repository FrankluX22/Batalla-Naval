import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivos {
    private  static final String RUTA = "puntajes.txt"; // Ruta del archivo donde se guardarán los puntajes

    public void guardarPuntaje(String nombre, boolean gano, int intentos) {
       try {
        // true = agregar al final del archivo, no sobrescribir.
        BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA, true));

        String resultado = gano ? "GANÓ" : "PERDIÓ";
        writer.write(nombre + " - " + resultado + " - Intentos: " + intentos); // Escribe el puntaje en el archivo
        writer.newLine(); // Agrega una nueva línea después de cada puntaje
        writer.close(); // Cierra el escritor para guardar los cambios

        System.out.println("Puntaje guardado correctamente.");
       } catch (IOException e) { // Manejo de excepciones en caso de error al escribir en el archivo
        System.out.println("Error al guardar el puntaje: " + e.getMessage());
       }
    }
}