package com.java.daynamicprograming;

public class LongestRepeatingSequence {


    public static void main(String[] args) {
        String str = "abcdjbck";
        String str2 = "adfbcdjkl";

        String lrs = "";
        int n = str.length();
        int m = str2.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                String x = lrs(str.substring(i, n), str2.substring(j, n));
                if (x.length() > lrs.length()) {
                    lrs = x;
                }
            }
        }


        System.out.println("Longest repeating sequence: " + lrs);
    }

    private static String lrs(String s, String t) {
        int n = Math.min(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.substring(0, i);
            }
        }
        return s.substring(0, n);
    }
} 