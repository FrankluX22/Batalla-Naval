package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivos {
    private  static final String RUTA = "puntajes.txt";

    public void guardarPuntaje(String nombre, boolean gano, int intentos) {
       try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA, true));

        String resultado = gano ? "GANO" : "PERDIO";
        writer.write(nombre + " - " + resultado + " - Intentos: " + intentos);
        writer.newLine();
        writer.close();

        System.out.println("Puntaje guardado correctamente.");
       } catch (IOException e) {
        System.out.println("Error al guardar el puntaje: " + e.getMessage());
       }
    }

    public void leerPuntajes() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader (RUTA));
            String linea;
            System.out.println("=== PUNTAJES GUARDADOS ===");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer los puntajes: " + e.getMessage());
        }
    }
}