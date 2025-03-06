/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondPartial;

/**
 *
 * @author cesar
 * Matricula: 12366
 * Fecha: 03/06/2025
 * 
 * - Compara pares de elementos y los intercambia si están en el orden incorrecto.
 * - En el peor caso, realiza O(n²) comparaciones e intercambios.
 * - En el mejor caso, puede detenerse temprano con O(n) comparaciones.
 * - Usa la optimización "swapped" para evitar iteraciones innecesarias.
 */

public class BubbleSort {
    public static int steps = 0;
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                steps++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}
