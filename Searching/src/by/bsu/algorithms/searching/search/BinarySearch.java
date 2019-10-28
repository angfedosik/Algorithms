package by.bsu.algorithms.searching.search;

public class BinarySearch {
    public static int binarySearch(int[]arr, int left, int right, int number){
        if(number<arr[left]|| number>arr[right])
            return -1;
        int index=-1;
        while (right>=left){
            int mid=left+(right-left)/2;
            if(number<arr[mid])
                right=mid-1;
            else if(number>arr[mid])
                left=mid+1;
            else if(number==arr[mid]){
                index=mid;
                break;
            }
        }
        return index;
    }
}
