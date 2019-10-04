package by.bsu.algorithms.quicksort.sort;
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
    public static void sortWithRandomElement(int[]arr, int first, int last){
        if (first<last) {
            Random random = new Random();
            int pivot = random.nextInt(last-first +1)+first;

            if(pivot!=last) Swap.SwapElementsInArray(arr, pivot, last);
            pivot=last;
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
                sortWithRandomElement(arr, first, newIndexOfPivot - 1);
            if (newIndexOfPivot < last)
                sortWithRandomElement(arr, newIndexOfPivot + 1, last);
        }
    }
    public static void hybridSort(int[]arr, int first, int last){
        int k=27;
        if (first<last) {
            if (last - first < k) {
                InsertionSort.insertionSort(arr, first, last);
                return;
            }
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
                hybridSort(arr, first, newIndexOfPivot - 1);
            if (newIndexOfPivot < last)
                hybridSort(arr, newIndexOfPivot + 1, last);
        }
    }
}
