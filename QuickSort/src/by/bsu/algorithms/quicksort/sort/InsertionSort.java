package by.bsu.algorithms.quicksort.sort;

public class InsertionSort {
    public static void insertionSort(int[]arr, int first, int last){
        for(int i=first+1; i<=last; i++){
            int element=arr[i];
            int j=i;
            while (j>first && arr[j-1]>element){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=element;
        }
    }
}
