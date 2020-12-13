package com.java.streamapi;

import java.util.Arrays;

public class BubbleSort {

    public static int [] bubbleSort(int [] value){

        int length = value.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){
                if(value[j]> value[j+1]){
                    int temp = value[j];
                    value[j]=value[j+1];
                    value[j+1]=temp;
                }
            }
        }
        return value;
    }

    public static void main(String [] args){
        int [] value ={10,11,9,12,8,13,7,14,6,15};
        int [] result = BubbleSort.bubbleSort(value);
        for(int i=0;i<result.length-1;i++){
            System.out.println(result[i]);
        }
    }
}
