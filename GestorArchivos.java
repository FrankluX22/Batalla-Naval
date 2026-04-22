import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivos {
    private  static final String RUTA = "puntajes.txt"; // Ruta del archivo donde se guardarán los puntajes

    public void guardarPuntaje(String nombre, boolean gano, int intentos) {
       try {
        // true = agregar al final del archivo, no sobrescribir.
        BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA, true));

        String resultado = gano ? "GANO" : "PERDIO";
        writer.write(nombre + " - " + resultado + " - Intentos: " + intentos); // Escribe el puntaje en el archivo
        writer.newLine(); // Agrega una nueva línea después de cada puntaje
        writer.close(); // Cierra el escritor para guardar los cambios

        System.out.println("Puntaje guardado correctamente.");
       } catch (IOException e) { // Manejo de excepciones en caso de error al escribir en el archivo
        System.out.println("Error al guardar el puntaje: " + e.getMessage());
       }
    }

    public void leerPuntajes() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader (RUTA));
            String linea;
            System.out.println("=== PUNTAJES GUARDADOS ===");
            while ((linea = reader.readLine()) != null) { // Lee cada línea del archivo hasta el final
                System.out.println(linea); // Imprime cada puntaje en la consola
            }
            reader.close(); // Cierra el lector
        } catch (IOException e) { // Manejo de excepciones en caso de error al leer el archivo
            System.out.println("Error al leer los puntajes: " + e.getMessage());
        }
    }
}