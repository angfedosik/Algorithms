package by.bsu.algorithms.mergesort.sort;

public class MergeSort {
    public static void mergeSort(int[] arr, int num){
        if(num>1){
            int mid=num/2;
            int[]left=new int[mid];
            int[]right=new int[num-mid];
            for(int i=0; i<mid; i++){
                left[i]=arr[i];
            }
            for (int i=0; i<num-mid; i++){
                right[i]=arr[mid+i];
            }
            mergeSort(left, mid);
            mergeSort(right,num-mid);
            merge(arr, left, right, mid, num-mid);
        }
    }

    public static void merge(int[]arr, int[] left, int[] right, int leftNum, int rightNum){

        int i=0, j=0, k=0;
        while(i<leftNum && j<rightNum){
            if(left[i]<right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i<leftNum) {
            arr[k++] = left[i++];
        }
        while (j<rightNum) {
            arr[k++] = right[j++];
        }
    }

    public static void hybridSort(int[]arr, int num){
        if(num>1){
            int k=27;
            if(num<k){
                InsertionSort.insertionSort(arr, num);
                return;
            }
            int mid=num/2;
            int[]left=new int[mid];
            int[]right=new int[num-mid];
            for(int i=0; i<mid; i++){
                left[i]=arr[i];
            }
            for (int i=0; i<num-mid; i++){
                right[i]=arr[mid+i];
            }
            hybridSort(left, mid);
            hybridSort(right,num-mid);
            merge(arr, left, right, mid, num-mid);
        }
    }
}
