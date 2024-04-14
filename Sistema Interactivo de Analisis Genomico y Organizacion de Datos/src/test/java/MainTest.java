import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {

    @Test
    public void testCountGenes() {
        String dna = "ATGCGATAGCTAGATCGAATCGTAGCTAGCTAGCTAGATCGATCGATCGATCGATCG";
        int expectedGeneCount = 5; // Ejemplo de un valor esperado
        assertEquals(expectedGeneCount, GenomicAnalyzer.countGenes(dna));
    }

    @Test
    public void testGenerateCombinations() {
        String[] alleles = {"A", "T", "C", "G"};
        int length = 3;
        int expectedCombinationsCount = 64; // Ejemplo de un valor esperado
        assertEquals(expectedCombinationsCount, GeneticCombinationCalculator.generateAllCombinations(alleles, length).size());
    }

    // Agrega más métodos de prueba para las demás funcionalidades según sea necesario
}