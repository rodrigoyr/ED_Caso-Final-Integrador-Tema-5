package optimization;

import java.util.Arrays;

public class QuicksortOptimizer {

    /**
     * Método para optimizar el algoritmo de ordenamiento Quicksort.
     *
     * @param array El arreglo a ordenar.
     * @param low   Índice más bajo del arreglo.
     * @param high  Índice más alto del arreglo.
     */
    public static void optimizedQuicksort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            if (pi - low < high - pi) {
                optimizedQuicksort(array, low, pi - 1);
                optimizedQuicksort(array, pi + 1, high);
            } else {
                optimizedQuicksort(array, pi + 1, high);
                optimizedQuicksort(array, low, pi - 1);
            }
        }
    }

    /**
     * Método para particionar el arreglo para el algoritmo Quicksort.
     *
     * @param array El arreglo a particionar.
     * @param low   Índice más bajo del arreglo.
     * @param high  Índice más alto del arreglo.
     * @return El índice de la partición.
     */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Arreglo original: " + Arrays.toString(array));
        optimizedQuicksort(array, 0, array.length - 1);
        System.out.println("Arreglo ordenado: " + Arrays.toString(array));
    }
}
