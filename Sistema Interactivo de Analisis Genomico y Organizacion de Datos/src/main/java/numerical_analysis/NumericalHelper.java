package numerical_analysis;

public class NumericalHelper {

    /**
     * Método recursivo para calcular la potencia de un número mediante multiplicaciones sucesivas.
     *
     * @param base     La base de la potencia.
     * @param exponent El exponente de la potencia.
     * @return El resultado de la potencia.
     */
    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }

    /**
     * Método recursivo para encontrar el valor máximo en un conjunto de datos numéricos.
     *
     * @param array El arreglo de datos numéricos.
     * @param start El índice de inicio para buscar en el arreglo.
     * @param end   El índice de fin para buscar en el arreglo.
     * @return El valor máximo en el conjunto de datos.
     */
    public static int findMax(int[] array, int start, int end) {
        if (start == end) {
            return array[start];
        } else {
            int mid = (start + end) / 2;
            int leftMax = findMax(array, start, mid);
            int rightMax = findMax(array, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Ejemplo de cálculo de potencia
        int base = 2;
        int exponent = 3;
        int result = calculatePower(base, exponent);
        System.out.println(base + " elevado a la " + exponent + " es: " + result);

        // Ejemplo de encontrar el valor máximo en un arreglo
        int[] numbers = {5, 2, 9, 1, 7};
        int max = findMax(numbers, 0, numbers.length - 1);
        System.out.println("El valor máximo en el arreglo es: " + max);
    }
}
