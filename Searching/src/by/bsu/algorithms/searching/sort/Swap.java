package by.bsu.algorithms.searching.sort;

public class Swap {
    public static void SwapElementsInArray(int[]arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
