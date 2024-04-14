package genomic_analysis;

public class GenomicAnalyzer {

    /**
     * Método para contar la cantidad de genes en una cadena de ADN.
     *
     * @param dna Cadena de ADN a analizar.
     * @return Cantidad de genes en la cadena de ADN.
     */
    public static int countGenes(String dna) {
        int count = 0;
        int index = dna.indexOf("ATG");

        while (index != -1) {
            count++;
            index = dna.indexOf("ATG", index + 3); // Avanzar a la siguiente ocurrencia de "ATG"
        }

        return count;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        String dnaSequence = "ATGCGTATGACCGATGAGCTAG";
        int geneCount = countGenes(dnaSequence);
        System.out.println("Número de genes en la secuencia de ADN: " + geneCount);
    }
}
