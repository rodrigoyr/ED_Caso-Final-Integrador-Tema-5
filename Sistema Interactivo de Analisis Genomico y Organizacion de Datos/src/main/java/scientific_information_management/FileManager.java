package scientific_information_management;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileManager {

    /**
     * Método para ordenar alfabéticamente las líneas de un ArrayList de Strings y escribirlas en un archivo.
     *
     * @param lines      ArrayList de Strings a ordenar y escribir en el archivo.
     * @param outputPath Ruta del archivo de salida donde se escribirán las líneas ordenadas.
     * @throws IOException Si ocurre un error de escritura en el archivo.
     */
    public static void sortAndWriteLines(ArrayList<String> lines, String outputPath) throws IOException {
        Collections.sort(lines);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String sortedLine : lines) {
                writer.write(sortedLine);
                writer.newLine();
            }
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("banana");
        lines.add("apple");
        lines.add("grape");

        String outputFilePath = "sorted_output.txt";
        try {
            sortAndWriteLines(lines, outputFilePath);
            System.out.println("Archivo ordenado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
