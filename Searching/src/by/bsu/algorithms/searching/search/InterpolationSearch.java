package by.bsu.algorithms.searching.search;

public class InterpolationSearch {
    public static int interpolationSearch(int[]arr, int left, int right, int number){
        if(number<arr[left]|| number>arr[right])
            return -1;
        int index=-1;
        while (right>=left){
            int mid=left+((number-arr[left])*(right-left)/(arr[right]-arr[left]));
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
