package by.bsu.algorithms.searching.sort;
import java.util.Random;

public class QuickSort {
    public static void sortWithLastElement(int[]arr, int first, int last) {
        if (first<last) {
            int pivot = last;
            int i = first;
            for (int j = first; j < last; j++) {
                if (arr[j] <= arr[pivot]) {
                    Swap.SwapElementsInArray(arr, i, j);
                    i++;
                }
            }
            int newIndexOfPivot = i;
            Swap.SwapElementsInArray(arr, newIndexOfPivot, pivot);

            if (newIndexOfPivot > 0)
                sortWithLastElement(arr, first, newIndexOfPivot - 1);
            if (newIndexOfPivot < last)
                sortWithLastElement(arr, newIndexOfPivot + 1, last);
        }
    }
}
