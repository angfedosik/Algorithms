package by.bsu.algorithms.quicksort;
import by.bsu.algorithms.quicksort.print.PrintArray;
import by.bsu.algorithms.quicksort.sort.QuickSort;
import java.util.Random;

public class Main {
    public static void main (String[]args){
        int num=10000;
        int[]array=new int[num];
        Random random=new Random();
        for(int i=0; i<num; i++){
            array[i]=random.nextInt(10000);
        }
        PrintArray.print(array, num);
        System.out.println();

        long time=System.currentTimeMillis();
        //QuickSort.sortWithLastElement(array, 0, num-1) ;
       // QuickSort.sortWithRandomElement(array, 0, num-1) ;
        QuickSort.hybridSort(array, 0, num-1);
        time=System.currentTimeMillis()-time;

        PrintArray.print(array, num);
        System.out.println("\nTime: "+time);

    }
}
