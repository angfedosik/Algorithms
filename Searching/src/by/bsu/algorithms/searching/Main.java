package by.bsu.algorithms.searching;

import by.bsu.algorithms.searching.search.BinarySearch;
import by.bsu.algorithms.searching.sort.QuickSort;

import java.util.Random;

public class Main {
    public static void main (String[]args){
        int num=100000000;
        int[]array=new int[num];
        Random random=new Random();
        for(int i=0; i<num; i++)
            //array[i]=random.nextInt(num);
            array[i]=i;
       // QuickSort.sortWithLastElement(array, 0, num-1);
        int number=random.nextInt(num);

        long time=System.currentTimeMillis();
        int index=BinarySearch.binarySearch(array, 0, num-1, number);
        time=System.currentTimeMillis()-time;
        if(index>=0) System.out.println("Index of element in array: "+ index);
        else System.out.println("This element is not in array");
        System.out.println("TIME: "+time);

        time=System.currentTimeMillis();
        index=BinarySearch.binarySearch(array, 0, num-1, number);
        time=System.currentTimeMillis()-time;
        if(index>=0) System.out.println("Index of element in array: "+ index);
        else System.out.println("This element is not in array");
        System.out.println("TIME: "+time);

        time=System.currentTimeMillis();
        index=BinarySearch.binarySearch(array, 0, num-1, number);
        time=System.currentTimeMillis()-time;
        if(index>=0) System.out.println("Index of element in array: "+ index);
        else System.out.println("This element is not in array");
        System.out.println("TIME: "+time);
    }
}
