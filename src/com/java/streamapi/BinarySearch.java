package com.java.streamapi;

import java.util.Arrays;

public class BinarySearch {



    public static void main(String [] args){

        int [] value ={10,11,9,12,8,13,7,14,6,15};

        int findKey=9;
        BinarySearch bs = new BinarySearch();
       int position = bs.binarySearch(value,0, value.length-1, findKey);
       System.out.println("value position in the array"+position);

    }

    private int binarySearch(int [] arr , int l, int r ,int x) {
        Arrays.sort(arr);
//        for(int i : arr){
//            System.out.println(i+" ");
//        }
//        int mid = (low + high) / 2;
//        while(low<=high) {
//            if (arr[mid] == item) {
//                return mid;
//            }
//            if (arr[mid]<item) {
//                low = mid + 1;
//                getValuePositron(arr,low,high,item);
//            } else {
//                high = mid - 1;
//                getValuePositron(arr,low,high,item);
//            }
//        }
//
//        return -1;


        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
