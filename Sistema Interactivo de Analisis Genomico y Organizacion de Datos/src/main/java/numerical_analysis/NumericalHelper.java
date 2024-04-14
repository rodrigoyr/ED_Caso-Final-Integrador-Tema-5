package numerical_analysis;

import java.util.ArrayList;

public class NumericalHelper {

    /**
     * Método para calcular la suma de los primeros n números naturales de forma recursiva.
     *
     * @param n El número hasta el cual se desea calcular la suma.
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
     * Método para listar números en un rango dado.
     *
     * @param start El número inicial del rango.
     * @param end   El número final del rango.
     * @return Un ArrayList de números en el rango [start, end].
     */
    public static ArrayList<Integer> listNumbersInRange(int start, int end) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
