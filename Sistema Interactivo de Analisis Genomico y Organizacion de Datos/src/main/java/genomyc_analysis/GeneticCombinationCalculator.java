package genomic_analysis;

import java.util.ArrayList;

public class GeneticCombinationCalculator {

    /**
     * Método recursivo para calcular las combinaciones genéticas.
     *
     * @param alleles    Lista de alelos disponibles.
     * @param combination Combinación parcial actual.
     * @param length     Longitud de la combinación a generar.
     * @param result     Lista para almacenar las combinaciones generadas.
     */
    public static void calculateCombinations(ArrayList<String> alleles, String combination, int length, ArrayList<String> result) {
        if (length == 0) {
            result.add(combination);
            return;
        }

        for (String allele : alleles) {
            String newCombination = combination + allele;
            calculateCombinations(alleles, newCombination, length - 1, result);
        }
    }

    /**
     * Método para generar todas las combinaciones genéticas posibles.
     *
     * @param alleles Lista de alelos disponibles.
     * @param length  Longitud de las combinaciones a generar.
     * @return Lista de todas las combinaciones genéticas posibles.
     */
    public static ArrayList<String> generateAllCombinations(ArrayList<String> alleles, int length) {
        ArrayList<String> combinations = new ArrayList<>();
        calculateCombinations(alleles, "", length, combinations);
        return combinations;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Definir los alelos disponibles
        ArrayList<String> alleles = new ArrayList<>();
        alleles.add("A");
        alleles.add("T");
        alleles.add("G");
        alleles.add("C");

        // Generar todas las combinaciones de 3 alelos
        int length = 3;
        ArrayList<String> allCombinations = generateAllCombinations(alleles, length);

        // Imprimir las combinaciones generadas
        for (String combination : allCombinations) {
            System.out.println(combination);
        }
    }
}
