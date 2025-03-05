package secondPartial;

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
