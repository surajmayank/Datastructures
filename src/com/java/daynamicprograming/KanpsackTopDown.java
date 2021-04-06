package com.java.daynamicprograming;

public class KanpsackTopDown {

    public static void main(String[] args) {
        int n = 3;
        int W = 4;
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int maxprof = KanpsackTopDown.knapSack(W, wt, val, n);
        System.out.println("max prof " + maxprof);
    }

    private static int knapSack(int w, int[] wt, int[] val, int n) {
        int i, j;
        int[][] t = new int[n + 1][w + 1];
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= w; j++) {
                    if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    t[i][j] = max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else
                    t[i][j] = t[i - 1][j];
            }
        }

        return t[n][w];
    }

    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }

}
