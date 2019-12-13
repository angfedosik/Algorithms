package by.bsu.algorithms.quicksort;
import by.bsu.algorithms.quicksort.check.CheckSort;
import by.bsu.algorithms.quicksort.sort.QuickSort;
import java.util.Random;

public class Main {
    public static void main (String[]args){
        int num=1000000;
        int[]array=new int[num];
        Random random=new Random();
        for(int i=0; i<num; i++){
            array[i]=random.nextInt(1000000);
        }

        int[]arr=array.clone();
        int k=30;
        long time = System.currentTimeMillis();
        QuickSort.hybridSort(arr, 0, num - 1, k);
        time = System.currentTimeMillis() - time;
        System.out.println("Array sorted: "+CheckSort.isArraySorted(arr, num));
        System.out.println("Time with HYBRID SORT with k = "+ k +": " + time);

        arr=array.clone();
        time=System.currentTimeMillis();
        QuickSort.sortWithLastElement(arr, 0, num-1) ;
        time=System.currentTimeMillis()-time;
        System.out.println("\nArray sorted: "+CheckSort.isArraySorted(arr, num));
        System.out.println("Time with LAST element as a pivot: "+time);

        arr=array.clone();
        time=System.currentTimeMillis();
        QuickSort.sortWithRandomElement(arr, 0, num-1) ;
        time=System.currentTimeMillis()-time;
        System.out.println("\nArray sorted: "+CheckSort.isArraySorted(arr, num));
        System.out.println("Time with RANDOM element as a pivot: "+time);


    }
}
