package numerical_analysis;

import java.util.ArrayList;

public class NumericalAnalyzer {

    /**
     * Método recursivo para calcular la suma de los primeros n números naturales.
     *
     * @param n El número hasta el cual se quiere calcular la suma.
     * @return La suma de los primeros n números naturales.
     */
    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + calculateSum(n - 1);
        }
    }

    /**
     * Método para listar los números naturales en un rango dado.
     *
     * @param start El primer número del rango.
     * @param end   El último número del rango.
     * @return Una lista de números naturales en el rango dado.
     */
    public static ArrayList<Integer> listNumbersInRange(int start, int end) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        int n = 5;
        int sum = calculateSum(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + sum);

        int start = 10;
        int end = 15;
        ArrayList<Integer> numbersInRange = listNumbersInRange(start, end);
        System.out.println("Números en el rango [" + start + ", " + end + "]: " + numbersInRange);
    }
}
