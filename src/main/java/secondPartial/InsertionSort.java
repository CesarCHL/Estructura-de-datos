package secondPartial;

/**
 * @author cesar 
 * Matricula: 12366
 * Fecha: 03/06/2025
 * - Toma cada elemento y lo inserta en la posición correcta en la parte ordenada del arreglo.
 * - En el peor caso (arreglo en orden inverso), realiza O(n²) comparaciones y desplazamientos.
 * - En el mejor caso (arreglo ya ordenado), solo hace O(n) comparaciones.
 * - Es un algoritmo eficiente para conjuntos pequeños o casi ordenados.
 */

public class InsertionSort {
    public static int steps = 0; 

    public static void insertionSort(int[] arr) {
        steps = 0; 
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                steps++; 
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        
        }
    }
}
