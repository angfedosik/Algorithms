package by.bsu.algorithms.quicksort.sort;

public class Swap {
    public static void SwapElementsInArray(int[]arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
