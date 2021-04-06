package com.java.daynamicprograming;

public class LongestReapeatingSequence_length {
    public static void main(String[] args) {
        String str1 = "abcdjbck";
        String str2 = "adfbcdjkl";

        String lrs = "";
        int n = str1.length();
        int m = str2.length();
        int str = lrs(str1,str2,n,m);
        System.out.println(str);
    }

    private static int lrs(String str1, String str2, int n, int m) {
        int t[][] = new int[n+1][m+1];
        char x [] = str1.toCharArray();
        char y [] = str2.toCharArray();
        int i,j;
        StringBuilder sb = new StringBuilder();
       for(i=1;i<=n;i++){
           for(j=1;j<=m;j++){
                if(x[i-1]==y[j-1] && i!=j){
                   t[i][j]=1+t[i-1][j-1];
               }
               else
                   t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
           }
       }
       System.out.println(sb.toString());
        return t[n][m];
    }
}
