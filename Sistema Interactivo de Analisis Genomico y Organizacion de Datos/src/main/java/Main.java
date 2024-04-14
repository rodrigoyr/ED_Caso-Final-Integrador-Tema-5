import genomic_analysis.GenomicAnalyzer;
import genomic_analysis.GeneticCombinationCalculator;
import numerical_analysis.NumericalAnalyzer;
import numerical_analysis.NumericalHelper;
import scientific_information_management.FileManager;
import scientific_information_management.ScientificInfoManager;
import optimization.QuicksortOptimizer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Conteo de genes en una cadena de ADN");
            System.out.println("2. Cálculo de combinaciones genéticas");
            System.out.println("3. Herramientas de análisis numérico");
            System.out.println("4. Gestión de información científica");
            System.out.println("5. Optimización de algoritmo de ordenamiento");
            System.out.println("6. Salir");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número

            switch (option) {
                case 1:
                    System.out.println("Ingrese la cadena de ADN:");
                    String dna = scanner.nextLine();
                    int geneCount = GenomicAnalyzer.countGenes(dna);
                    System.out.println("Número de genes en la cadena de ADN: " + geneCount);
                    break;
                case 2:
                    System.out.println("Ingrese los alelos separados por espacios:");
                    String[] alleles = scanner.nextLine().split("\\s+");
                    System.out.println("Ingrese la longitud de las combinaciones:");
                    int length = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después del número
                    ArrayList<String> combinations = GeneticCombinationCalculator.generateAllCombinations(new ArrayList<>(List.of(alleles)), length);
                    System.out.println("Combinaciones genéticas:");
                    for (String combination : combinations) {
                        System.out.println(combination);
                    }
                    break;
                case 3:
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Calcular la suma de los primeros n números naturales");
                    System.out.println("2. Listar números en un rango dado");
                    int numericOption = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después del número
                    switch (numericOption) {
                        case 1:
                            System.out.println("Ingrese el número n:");
                            int n = scanner.nextInt();
                            int sum = NumericalAnalyzer.calculateSum(n);
                            System.out.println("La suma de los primeros " + n + " números naturales es: " + sum);
                            break;
                        case 2:
                            System.out.println("Ingrese el inicio del rango:");
                            int start = scanner.nextInt();
                            System.out.println("Ingrese el fin del rango:");
                            int end = scanner.nextInt();
                            ArrayList<Integer> numbersInRange = NumericalHelper.listNumbersInRange(start, end);
                            System.out.println("Números en el rango [" + start + ", " + end + "]: " + numbersInRange);
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Ordenar líneas de un archivo de texto");
                    System.out.println("2. Buscar palabras en un archivo de texto");
                    System.out.println("3. Introducir y listar fechas");
                    int sciOption = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después del número
                    switch (sciOption) {
                        case 1:
                            System.out.println("Ingrese la ruta del archivo de entrada:");
                            String inputFilePath = scanner.nextLine();
                            System.out.println("Ingrese la ruta del archivo de salida:");
                            String outputFilePath = scanner.nextLine();
                            try {
                                FileManager.sortLines(inputFilePath, outputFilePath);
                                System.out.println("Archivo ordenado exitosamente.");
                            } catch (IOException e) {
                                System.err.println("Error al ordenar el archivo: " + e.getMessage());
                            }
                            break;
                        case 2:
                            // Agregar código para buscar palabras en un archivo de texto
                            break;
                        case 3:
                            ScientificInfoManager.manageDates();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 5:
                    // Agregar código para optimizar el algoritmo de ordenamiento
                    break;
                case 6:
                    System.out.println("¡Adiós!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
