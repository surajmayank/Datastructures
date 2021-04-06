package com.java.mustdoquestion.subarrays;

public class SubArraysumAlternate {
    public static void main(String[] args)
    {
        SubArraysumAlternate arraysum = new SubArraysumAlternate();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }

    private void subArraySum(int[] arr, int n, int sum) {

        int curr_sum = arr[0];
        int start = 0;
        for (int i = 1; i < n; i++) {
            if (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println("index " + start + " to " + p);
            }
            if (i < n) {
                curr_sum = curr_sum + arr[i];
            }
        }
    }
}
