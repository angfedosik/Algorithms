package by.bsu.algorithms.mergesort;

import by.bsu.algorithms.mergesort.check.CheckSort;
import by.bsu.algorithms.mergesort.sort.MergeSort;

import java.util.Random;

public class Main {
    public static void main (String[]args) {
        int num = 1000000;
        int[] array = new int[num];
        int[] array1 = new int[num];
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            array[i] = random.nextInt(1000000);
            array1[i] = array[i];
        }
        long time=System.currentTimeMillis();
        MergeSort.mergeSort(array, num);
        time=System.currentTimeMillis()-time;
        System.out.println("Array sorted: " +CheckSort.isArraySorted(array, num));
        System.out.println("Time: "+time);

        time=System.currentTimeMillis();
        MergeSort.hybridSort(array1, num);
        time=System.currentTimeMillis()-time;
        System.out.println("Array sorted: " +CheckSort.isArraySorted(array1, num));
        System.out.println("Time: "+time);
    }
}
