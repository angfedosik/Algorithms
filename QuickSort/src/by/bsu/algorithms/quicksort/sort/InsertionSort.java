package by.bsu.algorithms.quicksort.sort;

public class InsertionSort {
    public static void insertionSort(int[]arr, int first, int last){   //n=last-first
        //       1     1     1       2
        for(int i=first+1; i<=last; i++){  //2 + n +2(n-1) = 3n
            //         1    1
            int element=arr[i];     // 2
            //   1
            int j=i;             //1
            //      1      1     1  1  1
            while (j>first && arr[j-1]>element){  //5
                //  1 1   1  1
                arr[j]=arr[j-1];   //4
                // 2
                j--;   //2
            }
            //  1  1
            arr[j]=element;          //2
        }
    }                                //3n+1+(n-1)(2+1+(n-2)(5+4+2)+5+2) = 3n+1+(n-1)(10+11(n-2))=3n+1+10n-10+11(n-1)(n-2)= O(n^2)
}
