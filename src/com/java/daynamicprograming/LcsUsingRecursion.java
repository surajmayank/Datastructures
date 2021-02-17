package com.java.daynamicprograming;

public class LcsUsingRecursion {

    public static void main(String [] args){
            String str1 ="abcdefg";
            String str2 ="azblkc";

            String x = str1.substring(0,3);
            System.out.println("output--- "+x);
            char [] s1 = str1.toCharArray();
            char [] s2 = str2.toCharArray();
            int  s1Length = s1.length;
            int   s2Length = s2.length;
            int result = getlcs(s1,s2,s1Length,s2Length);
            System.out.println("lcs   "+result);
    }

    private static int getlcs(char[] s1, char[] s2, int s1Length, int s2Length) {
        if(s1Length==0 || s2Length==0){
            return 0;
        }
        if(s1[s1Length-1]==s2[s2Length-1]){
            return 1+getlcs(s1,s2,s1Length-1,s2Length-1);
        }
        else{
            return max(getlcs(s1, s2, s1Length-1, s2Length),getlcs(s1, s2, s1Length, s2Length-1));
        }
    }

    private static int max(int a, int b) {
        return (a>b)?a:b;
    }

}
