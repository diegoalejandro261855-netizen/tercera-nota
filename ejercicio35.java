import java.util.Arrays;
import java.util.Random;

public class OrdenarVectorAleatorio {
    public static void main(String[] args) {
        // 1. Definir el vector de 10 elementos enteros y la clase Random
        int[] vector = new int[10];
        Random aleatorio = new Random();

        // 2. Inicializar el vector con valores aleatorios (del 1 al 100)
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(100) + 1;
        }

        // 3. Mostrar el vector original (desordenado)
        System.out.println("--- Vector Original (Aleatorio) ---");
        System.out.println(Arrays.toString(vector));

        // 4. Ordenar los elementos de menor a mayor
        Arrays.sort(vector);

        // 5. Mostrar el vector ordenado
        System.out.println("\n--- Vector Ordenado (Menor a Mayor) ---");
        System.out.println(Arrays.toString(vector));
    }
}