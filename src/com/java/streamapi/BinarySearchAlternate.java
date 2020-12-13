package com.java.streamapi;

import java.util.Arrays;

public class BinarySearchAlternate {



    public static void main(String [] args){

        int [] value ={10,11,9,12,8,13,7,14,6,15};

        int findKey=5;
        BinarySearchAlternate bs = new BinarySearchAlternate();
      int ps =  bs.binarySearch(value,0, value.length-1, findKey);

      System.out.println("Position   "+ps);


    }

    private int binarySearch(int [] arr , int low, int high , int item) {
        Arrays.sort(arr);
        for(int i : arr){
            System.out.println(i+" ");
        }
        int mid = (low + high) / 2;
        while(low<=high) {
            if (arr[mid] == item) {
              return mid;
            }
            if (arr[mid]<item) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
            mid=(low+high)/2;
        }

      return -1;

    }
}

