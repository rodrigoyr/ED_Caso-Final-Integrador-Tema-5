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

    /**
     * Método para ordenar alfabéticamente las líneas de un archivo de texto.
     *
     * @param filePath Ruta del archivo de texto a ordenar.
     * @param outputPath Ruta del archivo de texto ordenado.
     * @throws IOException Si ocurre un error de lectura o escritura.
     */
    public static void sortLines(String filePath, String outputPath) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        Collections.sort(lines);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String sortedLine : lines) {
                writer.write(sortedLine);
                writer.newLine();
            }
        }
    }
}
