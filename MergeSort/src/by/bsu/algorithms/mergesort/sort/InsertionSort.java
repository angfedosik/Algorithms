package by.bsu.algorithms.mergesort.sort;

public class InsertionSort {
    public static void insertionSort(int[]arr, int num){
        for(int i=1; i<num; i++){
            int element=arr[i];
            int j=i;
            while (j>0 && arr[j-1]>element){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=element;
        }
    }
}
