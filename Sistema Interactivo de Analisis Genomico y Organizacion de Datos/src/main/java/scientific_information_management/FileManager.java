package scientific_information_management;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FileManager {

    /**
     * Método para leer un archivo de texto y ordenar alfabéticamente sus líneas.
     *
     * @param filename Nombre del archivo a leer.
     * @return Lista de líneas del archivo ordenadas alfabéticamente.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    public static ArrayList<String> readAndSortLines(String filename) throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        Collections.sort(lines);
        return lines;
    }

    /**
     * Método para escribir líneas en un archivo de texto.
     *
     * @param filename Nombre del archivo a escribir.
     * @param lines    Lista de líneas a escribir en el archivo.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    public static void writeLinesToFile(String filename, ArrayList<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        String inputFile = "data.txt"; // Ubicación relativa del archivo
        String outputFile = "output.txt";

        try {
            // Verificar si el archivo de entrada existe
            if (!fileExists(inputFile)) {
                throw new IOException("El archivo de entrada no existe.");
            }

            // Leer el archivo de entrada y ordenar sus líneas
            ArrayList<String> sortedLines = readAndSortLines(inputFile);

            // Escribir las líneas ordenadas en el archivo de salida
            writeLinesToFile(outputFile, sortedLines);

            System.out.println("Archivo de salida creado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al manipular archivos: " + e.getMessage());
        }
    }

    /**
     * Método para verificar si un archivo existe.
     *
     * @param filename Nombre del archivo.
     * @return true si el archivo existe, false de lo contrario.
     */
    public static boolean fileExists(String filename) {
        return new java.io.File(filename).exists();
    }
}
