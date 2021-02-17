package com.java.test;

public class Arrange_0_1_2 {

    public static void main(String[] args) {
        Arrange_0_1_2 seg = new Arrange_0_1_2();
        int[] arr = new int[]{1, 0, 0, 1, 2, 1,2};
        int i, arr_size = arr.length;

        seg.segregate0and1(arr, arr_size);

        System.out.print("Array after segregation is ");
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    private void segregate0and1(int[] a, int arr_size) {
        int lo=0;
        int hi=arr_size-1;
        int mid=0;
        int temp=0;
        while(mid<=hi){
            switch (a[mid]) {
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
}
