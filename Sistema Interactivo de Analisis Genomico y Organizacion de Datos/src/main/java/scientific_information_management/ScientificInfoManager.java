package scientific_information_management;

import java.io.IOException;
import java.util.ArrayList;

public class ScientificInfoManager {

    /**
     * Método para ordenar alfabéticamente las líneas de un archivo de texto.
     *
     * @param filename Nombre del archivo a procesar.
     * @return Lista de líneas del archivo ordenadas alfabéticamente.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    public static ArrayList<String> sortLinesInFile(String filename) throws IOException {
        return FileManager.readAndSortLines(filename);
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        String filename = "data.txt";

        try {
            // Ordenar alfabéticamente las líneas del archivo
            ArrayList<String> sortedLines = sortLinesInFile(filename);

            // Imprimir las líneas ordenadas
            System.out.println("Líneas ordenadas del archivo " + filename + ":");
            for (String line : sortedLines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al manipular archivos: " + e.getMessage());
        }
    }
}
