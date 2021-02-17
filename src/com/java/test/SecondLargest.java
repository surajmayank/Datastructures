package com.java.test;

public class SecondLargest {

    public static void main(String args[]){
        int arr []={12, 35, 1, 10, 34, 1};
       int max= getMaximum(arr);
       int secondMax=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>secondMax && arr[i]<max){
               secondMax=arr[i];
           }
       }
       System.out.println("secondMax  "+secondMax);
    }
    private static int getMaximum(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
