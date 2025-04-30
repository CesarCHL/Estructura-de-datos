/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondPartial;

/**
 *
 * @author cesar
*/

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Array original:");
        printArray(array);

        // Insertion Sort
        int[] insertionArray = array.clone();
        System.out.println("\nOrdenando con Insertion Sort:");
        InsertionSort.insertionSort(insertionArray);
        printArray(insertionArray);
        System.out.println("Pasos: " + InsertionSort.steps);

        // Selection Sort
        int[] selectionArray = array.clone();
        System.out.println("\nOrdenando con Selection Sort:");
        SelectionSort.selectionSort(selectionArray);
        printArray(selectionArray);
        System.out.println("Pasos: " + SelectionSort.steps);

        // Bubble Sort
        int[] bubbleArray = array.clone();
        System.out.println("\nOrdenando con Bubble Sort:");
        BubbleSort.bubbleSort(bubbleArray);
        printArray(bubbleArray);
        System.out.println("Pasos: " + BubbleSort.steps);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
