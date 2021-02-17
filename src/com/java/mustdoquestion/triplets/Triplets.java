package com.java.mustdoquestion.triplets;

import com.java.mustdoquestion.subarrays.SubarraySum;

import java.util.Arrays;

public class Triplets {

    public static void main(String[] args)
    {
        Triplets arraysum = new Triplets();
        int arr[] = {12,8,2,11,5,14,10};
        int n = arr.length;
      int tripletcount=  arraysum.trplets(arr, n);
      System.out.println("triplets "+tripletcount);
    }

    private int trplets(int[] arr, int n) {
        Arrays.sort(arr);
        int counter=0;
        for(int i=n-1;i>=0;i--) {
            int startPointer = 0;
            int endPointer = i - 1;
            while (startPointer < endPointer) {
                if (arr[startPointer] + arr[endPointer] == arr[i]) {
                    counter++;
                    startPointer++;
                    endPointer--;
                } else if (arr[startPointer] + arr[endPointer] < arr[i]) {
                    startPointer++;
                } else {
                    endPointer--;
                }

            }
        }
        return counter;
    }

}
