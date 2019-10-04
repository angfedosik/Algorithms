package by.bsu.algorithms.quicksort;
import by.bsu.algorithms.quicksort.check.CheckSort;
import by.bsu.algorithms.quicksort.sort.QuickSort;
import java.util.Random;

public class Main {
    public static void main (String[]args){
        int num=1000000;
        int[]array=new int[num];
        int[]array1=new int[num];
        int[]array2=new int[num];
        Random random=new Random();
        for(int i=0; i<num; i++){
            array[i]=random.nextInt(1000000);
            array1[i]=array[i];
            array2[i]=array[i];
        }

        long time=System.currentTimeMillis();
        QuickSort.sortWithLastElement(array, 0, num-1) ;
        time=System.currentTimeMillis()-time;
        System.out.println(CheckSort.isArraySorted(array, num));
        System.out.println("Time with LAST element as a pivot: "+time);

        time=System.currentTimeMillis();
        QuickSort.sortWithRandomElement(array1, 0, num-1) ;
        time=System.currentTimeMillis()-time;
        System.out.println(CheckSort.isArraySorted(array1, num));
        System.out.println("Time with RANDOM element as a pivot: "+time);

        time=System.currentTimeMillis();
        QuickSort.hybridSort(array2, 0, num-1);
        time=System.currentTimeMillis()-time;
        System.out.println(CheckSort.isArraySorted(array, num));
        System.out.println("Time with HYBRID sorting: "+time);
    }
}
