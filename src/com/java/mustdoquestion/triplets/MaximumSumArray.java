package com.java.mustdoquestion.triplets;

public class MaximumSumArray {

    public static void main(String[] args)
    {
        MaximumSumArray arraysum = new MaximumSumArray();
        int arr[] = {12,8,2,-23,5,-14,10};
        int n = arr.length;
        int max=  arraysum.maximumsumArray(arr, n);
        System.out.println("SUM "+max);
    }

    private int maximumsumArray(int[] arr, int n) {
       int max_so_far = 0;
        int max_ending_here = 0 ;
        for(int a:arr){
            max_ending_here = max_ending_here + a;
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

}
