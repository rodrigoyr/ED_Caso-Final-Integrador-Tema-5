# ED_Caso-Final-Integrador-Tema-5
## Introducción
N este docuymento detallo todo lo pedido por el profesor, cabe destacar el intento de usar la maxima recursividad prosible, así como los algoritmos aprendidos en clase. Además de haber investigado y añadido otros. Al final de este informe destaco los problemas que he tenido a lña hora de realizar el trabajo y como los he solucionado. Espero le guste.

## Funcionalidades
### Módulo de Análisis Genómico
La función countGenes de la clase GenomicAnalyzer cuenta el número de genes en una cadena de ADN. Utiliza "ATG" como inicio de un gen y busca secuencias de gnes validas de genes en la cadena de ADN

*Ejemplo de uso:*
java
Copy code
String dna = "ATGCGATAGCTAGATCGAATCGTAGCTAGCTAGCTAGATCGATCGATCGATCGATCG";
int geneCount = GenomicAnalyzer.countGenes(dna);
// geneCount debería ser 5

*Casos de prueba:*
Cadena de ADN sin genes.
Cadena de ADN con un solo gen.
Cadena de ADN con múltiples genes.

### Cálculo de Combinaciones Genéticas
El algoritmo generateAllCombinations de la clase GeneticCombinationCalculator genera todas las combinaciones posibles con una longitud que se da. Esto es util para predecir patrones geneticos basados de un modelo

*Ejemplo de uso:*
java
Copy code
String[] alleles = {"A", "T", "C", "G"};
int length = 3;
ArrayList<String> combinations = GeneticCombinationCalculator.generateAllCombinations(new ArrayList<>(List.of(alleles)), length);
// combinations debería contener todas las combinaciones posibles de 3 alelos

*Casos de prueba:*
Combinaciones con diferentes longitudes.
Diferentes conjuntos de alelos.
### Módulo de Análisis Numérico
La función calculateSum de NumericalAnalyzer calcula la suma de los primeros números naturales utilizando recursión como hempos visto en clase.

*Ejemplo de uso:*
java
Copy code
int n = 5;
int sum = NumericalAnalyzer.calculateSum(n);
// sum debería ser 15

*Casos de prueba:*
Suma de 0 números.
Suma de un solo número.
Suma de múltiples números.

### Listado de Números en un Rango Dado
La función listNumbersInRange de la clase hace una lista de todos los numeros en un rango dado

*Ejemplo de uso:*
java
Copy code
int start = 1;
int end = 5;
ArrayList<Integer> numbersInRange = NumericalHelper.listNumbersInRange(start, end);
// numbersInRange debería contener [1, 2, 3, 4, 5]

*Casos de prueba:*
Rango con un solo número.
Rango con varios números.
Rango que incluye números negativos.

### Módulo de Gestión de Información Científica
El método sortLines de la clase FileManager ordena en orden alfabrtico las líneas de un archivo de texto y las escribe en un archivo diferente nuevo

*Ejemplo de uso:*
java
Copy code
String inputFilePath = "input.txt";
String outputFilePath = "output.txt";
FileManager.sortLines(inputFilePath, outputFilePath);
// Las líneas del archivo input.txt deberían estar ordenadas en output.txt

*Casos de prueba:*
Archivo de entrada vacío.
Archivo de entrada con líneas desordenadas.
Archivo de entrada con líneas ya ordenadas.
### Búsqueda Eficiente en Textos
Descripción y casos de prueba
El método optimizedQuicksort de la clase QuicksortOptimizer optimiza el algoritmo  Quicksort para minimizar la recursión.

*Ejemplo de uso:*
java
Copy code
int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
QuicksortOptimizer.optimizedQuicksort(array, 0, array.length - 1);
// El arreglo debería estar ordenado

*Casos de prueba:*
Arreglo desordenado.
Arreglo ya ordenado.
Arreglo con elementos repetidos.

## Problemas y soluciones
En este proyecto no he tenido problemas relevantes con los que me haya encontrado que me hayan quitado mucho tiempo o me hayan costado resolver, este proyecto lo he relizado comodamente a diferencia de ptros casos integradores, como el anterior, si es verdad que me he encontrado con algunos de ellos que he resolvido de la mejor manera posible. Uno de los problemas con los que me he contrado es tratando de integrar las funciones recursivas que nos comentó Ruben que debíamos usar, ya que de lo contrario no seía valido el trabajo, he integrado lo dicho en clase además de otras implementaciones. Otro de los prblemas con los que me he topado ha sido en la clase FilaManager, ya que estaba nombrando en el codigo una ruta de archivo que no existía, después lo he solucionado cambiandola a una que si existía en mi sistema, pero después me he dado cuenta que al ejecutarlo desde otro sistema no valía, por lo que he eliminado las referebcias externa, y lo he hehcho todo internamente, así que debería funcionar desde cualquier sistema. Con este trabajo he practicado las funciones recursivas, además de importar y enelzar diferentes clases para que funcionen conjuntamente. Espero este trabajo sea de su agrado. Muchas gracias.
