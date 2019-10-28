package by.bsu.algorithms.searching.search;

public class LinearSearch {
    public static int linearSearch(int[]arr, int length, int number){
        for(int i=0; i<length; i++){
            if(arr[i]==number)
                return i;
        }
        return -1;
    }
}
