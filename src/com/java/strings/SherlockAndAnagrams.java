package com.java.strings;

import java.io.IOException;
import java.util.*;

public class SherlockAndAnagrams {
    public static List<String> getAllSubstrings(String str) {
        int i, j;
        List<String> list = new ArrayList<>();
        for (i = 0; i < str.length(); i++) {
            for (j = i + 1; j < str.length() + 1; j++) {
                //System.out.println("SubString " + str.substring(i, j));
                list.add(str.substring(i, j));
            }
        }
        return list;
    }

    public static int getCounter(int increment, List<String> substringList) {
        String str = substringList.get(increment);
        int counter = 0;
        for (int i = increment + 1; i < substringList.size(); i++) {
            if (str.length() == substringList.get(i).length() && isAnagram(str, substringList.get(i))) {
                counter++;
            }
        }
        return counter;

    }

    private static boolean isAnagram(String str, String s) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        char[] str1 = str.toCharArray();
        char[] str2 = s.toCharArray();
        for (int i = 0; i < str1.length; i++) {
            if (m1.get(str1[i]) == null) {
                m1.put(str1[i], 1);
            } else {
                int c = m1.get(str1[i]);
                m1.put(str1[i], ++c);
            }
        }
        for (int i = 0; i < str2.length; i++) {
            if (m2.get(str2[i]) == null) {
                m2.put(str2[i], 1);
            } else {
                int c = m2.get(str2[i]);
                m2.put(str2[i], ++c);
            }
        }
        return m1.equals(m2);
    }

    static int sherlockAndAnagrams(String s) {
        List<String> substringList = getAllSubstrings(s);
        int sum = 0;
        for (int i = 0; i < substringList.size(); i++) {
            sum = sum + getCounter(i, substringList);
        }


        return sum;
    }


    public static void main(String[] args) throws IOException {
        String s = "abba";
        int result = sherlockAndAnagrams(s);
        System.out.println("result "+result);
    }
}
