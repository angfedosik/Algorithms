package by.bsu.algorithms.quicksort.sort;
import java.util.Random;

public class QuickSort {
    public static void swap(int[]arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void sortWithLastElement(int[]arr, int first, int last){
        int pivot=last;
        int newIndexOfPivot=0, j=0;
        while(j<pivot) {
            while (arr[j] > arr[pivot]) j++;
            swap(arr, newIndexOfPivot, j);
            j++;
            newIndexOfPivot++;
        }
        swap(arr, newIndexOfPivot, pivot);

        if(newIndexOfPivot>0)
            sortWithLastElement(arr, first, newIndexOfPivot-1);
        if(newIndexOfPivot<last)
            sortWithLastElement(arr, newIndexOfPivot+1, last);
    }
    public static void sortWithRandomElement(int[]arr, int first, int last){
        Random random=new Random();
        int pivot=random.nextInt(last+1);
        int i=0, j=last;
        while(j>=i) {
            while (arr[i] < arr[pivot]) i++;
            while (arr[j] > arr[pivot]) j--;
            swap(arr, i, j);
            i++;
            j--;
        }
        if(i<j)swap(arr, pivot, i);
        int newIndexOfPivot=i;
        if(newIndexOfPivot>0)
            sortWithLastElement(arr, first, newIndexOfPivot-1);
        if(newIndexOfPivot<last)
            sortWithLastElement(arr, newIndexOfPivot+1, last);
    }
    public static void hybridSort(int[]arr, int first, int last){
        int k=10;
        if(last-first<k) {
            InsertionSort.insertionSort(arr, last + 1);
            return;
        }
        Random random=new Random();
        int pivot=random.nextInt(last+1);
        int i=0, j=last;
        while(j>=i) {
            while (arr[i] < arr[pivot]) i++;
            while (arr[j] > arr[pivot]) j--;
            swap(arr, i, j);
            i++;
            j--;
        }
        if(i<j)swap(arr, pivot, i);
        int newIndexOfPivot=i;
        if(newIndexOfPivot>0)
            sortWithLastElement(arr, first, newIndexOfPivot-1);
        if(newIndexOfPivot<last)
            sortWithLastElement(arr, newIndexOfPivot+1, last);
    }
}
