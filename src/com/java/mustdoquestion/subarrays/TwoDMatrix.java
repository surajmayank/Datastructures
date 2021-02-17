package com.java.mustdoquestion.subarrays;

public class TwoDMatrix {

    public static void main(String [] args){

        int matrix [] [] ={{2, 3, 4}};

        int j=0;
        int length= matrix.length;
        int primarySum = 0;
        int secndorySum = 0;
        for(int i=0;i< matrix.length;i++){
            primarySum =primarySum+ matrix[i][j];
            secndorySum =secndorySum+ matrix[i][length-1];
            length--;
            j++;
        }
        System.out.println("primarySum "+primarySum);
        System.out.println("secondarySum "+secndorySum);

    }
}
