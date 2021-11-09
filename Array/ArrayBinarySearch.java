package Array;

import java.util.Scanner;

// Pre-requirement of binary search is that the given array must be sorted
public class ArrayBinarySearch {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[]args){
        int[]arr = {5,7,10,12,15,20,27,31,36,42,55,58,60,65,70,78};
        System.out.println("The entered no. is at this index " + binarySearch(arr,27));
    }
    public static int binarySearch(int[]arr , int num){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
             int mid = (low+high)/2;
             if(arr[mid]<num){
                 low = mid+1;
             }
             else if(arr[mid]>num){
                 high = mid-1;
             }else{
                 return mid;
             }
        }
        return -1;
    }
}
