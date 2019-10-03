package by.bsu.algorithms.quicksort;
import by.bsu.algorithms.quicksort.check.CheckSort;
import by.bsu.algorithms.quicksort.print.PrintArray;
import by.bsu.algorithms.quicksort.sort.InsertionSort;
import by.bsu.algorithms.quicksort.sort.QuickSort;
import java.util.Random;

public class Main {
    public static void main (String[]args){
        int num=10000000;
        int[]array=new int[num];
        int[]array1=new int[num];
        int[]array2=new int[num];
        int[]array3=new int[num];
        int[]array4=new int[num];
        int[]array5=new int[num];
        int[]array6=new int[num];
        int[]array7=new int[num];
        int[]array8=new int[num];
        Random random=new Random();
        for(int i=0; i<num; i++){
            array[i]=random.nextInt(10000000);
            array1[i]=array[i];
            array2[i]=array[i];
            array3[i]=array[i];
            array4[i]=array[i];
            array5[i]=array[i];
            array6[i]=array[i];
            array7[i]=array[i];
            array8[i]=array[i];
        }
        //PrintArray.print(array, num);
        System.out.println();

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
        QuickSort.hybridSort(array2, 0, num-1, 12);
        time=System.currentTimeMillis()-time;
        System.out.println("12: "+time);

        time=System.currentTimeMillis();
        QuickSort.hybridSort(array3, 0, num-1, 14);
        time=System.currentTimeMillis()-time;
        System.out.println("14: "+time);

        time=System.currentTimeMillis();
        QuickSort.hybridSort(array4, 0, num-1, 15);
        time=System.currentTimeMillis()-time;
        System.out.println("15: "+time);

        time=System.currentTimeMillis();
        QuickSort.hybridSort(array5, 0, num-1, 16);
        time=System.currentTimeMillis()-time;
        System.out.println("16: "+time);

        time=System.currentTimeMillis();
        QuickSort.hybridSort(array6, 0, num-1, 17);
        time=System.currentTimeMillis()-time;
        System.out.println("17: "+time);

        time=System.currentTimeMillis();
        QuickSort.hybridSort(array7, 0, num-1, 19);
        time=System.currentTimeMillis()-time;
        System.out.println("19: "+time);

        time=System.currentTimeMillis();
        QuickSort.hybridSort(array8, 0, num-1, 100);
        time=System.currentTimeMillis()-time;
        System.out.println("6: "+time);
        //PrintArray.print(array2, num);

    }
}
