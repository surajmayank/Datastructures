package com.java.mustdoquestion.subarrays;

public class SubarraySum {

    int subArraySum(int arr[], int n, int sum) {

        int curr_sum=arr[0];
        int start=0;
        int i;
        for(i=1;i<=n;i++) {
            if (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println("index " + start + " to index " + p);
                return 0;
            }
            if(i<n){
                curr_sum=curr_sum+arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args)
    {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }
}
