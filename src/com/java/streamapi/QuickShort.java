package com.java.streamapi;

public class QuickShort {

    public static void main(String [] args) {
        int [] value ={10,11,9,12,8,13,7,14,6,15};
        int length=value.length;

        QuickShort quick = new QuickShort();
        quick.getQuickShort(value,0,length-1);
        quick.printShortingArray(value);



    }

    private int partition(int [] arr , int low , int high){
        int pivote = arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivote){
                low++;
            }
            while(arr[high]>pivote){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }

        return low;
    }

    void getQuickShort(int[] value, int low, int high) {

        int pi = partition(value,low,high);


        if(low < pi-1){
                getQuickShort(value,low,pi-1);
        }
        if(pi<high){
            getQuickShort(value,pi,high);
        }
    }

    void printShortingArray(int[] arr) {

        for(int i:arr){
            System.out.println(i+" ");
        }

    }

}
