package by.bsu.algorithms.quicksort.sort;

public class InsertionSort {
    public static void insertionSort(int[]arr, int first, int last){   //n=last-first
        for(int i=first+1; i<=last; i++){  //2 + n +2(n-1) = 3n
            int element=arr[i];     // 2
            int j=i;             //1
            while (j>first && arr[j-1]>element){  //5
                arr[j]=arr[j-1];   //4
                j--;   //2
            }
            arr[j]=element;          //2
        }
    }                                                 //3n+(n-1)(2+1+logn(5+4+2) +2) = 3n+(n-1)(5+11logn)  =  O(nlogn)
}
