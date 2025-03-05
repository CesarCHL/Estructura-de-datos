/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondPartial;

/**
 *
 * @author cesar
 */

public class SelectionSort {
    public static int steps = 0; // Contador de pasos

    public static void selectionSort(int[] arr) {
        steps = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                steps++;          // Cuenta cada comparación del ciclo interno
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambio solo si hay un cambio
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
