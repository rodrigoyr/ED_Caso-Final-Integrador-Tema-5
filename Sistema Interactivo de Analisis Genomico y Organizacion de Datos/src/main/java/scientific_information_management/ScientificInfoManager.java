package scientific_information_management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScientificInfoManager {

    /**
     * Método para buscar una palabra en un arreglo de cadenas de texto de manera lineal.
     *
     * @param words El arreglo de palabras.
     * @param target La palabra a buscar.
     * @return La posición de la palabra en el arreglo, o -1 si no se encuentra.
     */
    public static int linearSearch(String[] words, String target) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Método para buscar una palabra en un arreglo de cadenas de texto de manera binaria.
     *
     * @param words El arreglo de palabras (debe estar ordenado alfabéticamente).
     * @param target La palabra a buscar.
     * @return La posición de la palabra en el arreglo, o -1 si no se encuentra.
     */
    public static int binarySearch(String[] words, String target) {
        int left = 0;
        int right = words.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = target.compareTo(words[mid]);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Método para introducir y listar fechas de manera ordenada.
     */
    public static void manageDates() {
        ArrayList<String> dates = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce las fechas (formato DD/MM/AAAA), escribe 'fin' para terminar:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }
            dates.add(input);
        }

        Collections.sort(dates);
        System.out.println("Fechas ordenadas:");
        for (String date : dates) {
            System.out.println(date);
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Ejemplo de búsqueda lineal
        String[] words = {"apple", "banana", "grape", "orange", "pear"};
        String target = "grape";
        int linearResult = linearSearch(words, target);
        System.out.println("Resultado de búsqueda lineal: " + linearResult);

        // Ejemplo de búsqueda binaria
        String[] sortedWords = {"apple", "banana", "grape", "orange", "pear"};
        int binaryResult = binarySearch(sortedWords, target);
        System.out.println("Resultado de búsqueda binaria: " + binaryResult);

        // Ejemplo de gestión de fechas
        manageDates();
    }
}
