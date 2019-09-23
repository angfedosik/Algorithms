package by.bsu.algorithms.quicksort.sorting;

public class InsertionSort {
    public static void insertionSort(int[]arr, int num){
        for(int i=1; i<num; i++){
            int element=arr[i];
            int j=1;
            for(; j>0; j--){
                if(arr[j]<arr[j-1])
                    arr[j]=arr[j-1];
                else break;
            }
            arr[j-1]=element;
        }
    }
}
