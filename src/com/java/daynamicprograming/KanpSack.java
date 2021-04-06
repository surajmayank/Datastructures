package com.java.daynamicprograming;

public class KanpSack {

   static int [][] t = new int[102][102];
    public static void main(String[] args){
        for(int i = 0; i < 102; i++) {
            for(int j = 0; j < 102; j++) {
                t[i][j] = -1;
            }
        }
        int n = 3;
        int W = 4;
        int[] val = {1,2,3};
        int[] wt = {4,5,1};
        int maxprof=KanpSack.knapSack(W, wt,val,n);
        System.out.println("max prof "+maxprof);

    }
    static int knapSack(int W, int[] wt, int[] val, int n)

    {
        if(n==0||W ==0)
            return 0;
        if(t[n][W]!=-1)
            return t[n][W];
        if(wt[n-1]<=W) {
            return t[n][W]=max(val[n - 1] + knapSack(W - wt[n - 1], wt,val,n - 1),knapSack(W, wt,val,n - 1));
        }
        else if(wt[n-1]>W)
        return t[n][W]=knapSack(W,wt,val,n-1);
        return 1;
    }

    public static int max(int val1, int val2){
        if(val1>val2)
            return val1;

        return val2;
    }
}
