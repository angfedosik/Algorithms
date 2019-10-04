package by.bsu.algorithms.mergesort.check;

public class CheckSort {
    public static boolean isArraySorted (int[] arr, int num){
        for(int i=0; i<num-1; i++){
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
    return true;
    }
}
