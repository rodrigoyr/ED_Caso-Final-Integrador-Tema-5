package scientific_information_management;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileManager {

    /**
     * Método para ordenar alfabéticamente las líneas de un archivo de texto.
     *
     * @param inputFile  Ruta del archivo de entrada.
     * @param outputFile Ruta del archivo de salida para las líneas ordenadas.
     * @throws IOException Si ocurre un error de lectura o escritura de archivos.
     */
    public static void sortLines(String inputFile, String outputFile) throws IOException {
        // Leer líneas del archivo de entrada
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        // Ordenar las líneas alfabéticamente
        Collections.sort(lines);

        // Escribir las líneas ordenadas en el archivo de salida
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        try {
            sortLines(inputFile, outputFile);
            System.out.println("Las líneas del archivo " + inputFile + " han sido ordenadas y escritas en " + outputFile);
        } catch (IOException e) {
            System.err.println("Error al ordenar las líneas del archivo: " + e.getMessage());
        }
    }
}
