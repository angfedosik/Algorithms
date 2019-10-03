package by.bsu.algorithms.quicksort.sort;
import java.util.Random;

public class QuickSort {
    public static void swap(int[]arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void sortWithLastElement(int[]arr, int first, int last) {
        if (first<last) {
            int pivot = last;
            int i = first;
            for (int j = first; j < last; j++) {
                if (arr[j] <= arr[pivot]) {
                    swap(arr, i, j);
                    i++;
                }
            }
            int newIndexOfPivot = i;
            swap(arr, newIndexOfPivot, pivot);

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
            /*int newIndexOfPivot = last;
            int i = first;
            int j = last;
            while (true) {
                while (arr[i] <= arr[pivot] && i < pivot)
                    i++;
                while (arr[j] > arr[pivot] && pivot < j)
                    j--;
                if (i != j)
                    swap(arr, i, j);
                    if(i==pivot) pivot = j;
                    else if(j==pivot) pivot = i;
                else {
                   // if(i!=pivot) swap(arr, i, pivot);
                    newIndexOfPivot = i;
                    break;
                }
            }*/
            if(pivot!=last) swap(arr, pivot, last);
            pivot=last;
            int i = first;
            for (int j = first; j < last; j++) {
                if (arr[j] <= arr[pivot]) {
                    swap(arr, i, j);
                    i++;
                }
            }
            int newIndexOfPivot = i;
            swap(arr, newIndexOfPivot, pivot);
            if (newIndexOfPivot > 0)
                sortWithRandomElement(arr, first, newIndexOfPivot - 1);
            if (newIndexOfPivot < last)
                sortWithRandomElement(arr, newIndexOfPivot + 1, last);
        }
    }
    public static void hybridSort(int[]arr, int first, int last, int k){
        //int k=8;
        if (first<last) {
            if (last - first < k) {
                InsertionSort.insertionSort(arr, first, last);
                return;
            }
            int pivot = last;
            int i = first;
            for (int j = first; j < last; j++) {
                if (arr[j] <= arr[pivot]) {
                    swap(arr, i, j);
                    i++;
                }
            }
            int newIndexOfPivot = i;
            swap(arr, newIndexOfPivot, pivot);
            if (newIndexOfPivot > 0)
                hybridSort(arr, first, newIndexOfPivot - 1, k);
            if (newIndexOfPivot < last)
                hybridSort(arr, newIndexOfPivot + 1, last, k);
        }
    }
}
