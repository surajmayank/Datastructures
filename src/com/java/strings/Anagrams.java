package com.java.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        String s1 = "forgeeksgeeks";
        boolean check = getanagram(s, s1);
        if (check == true) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }

    }

    private static boolean getanagram(String c, String d) {
        if (c.length() != d.length())
            return false;

        int count = 0;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        char[] s1 = c.toCharArray();
        char[] s2 = d.toCharArray();

        List<?> list1 = Arrays.asList(s1);
        List<?> list2 = Arrays.asList(s2);

       /*map1 =  list1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
       map2 = list2.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));*/

        System.out.println("first loop started");
        for (int i = 0; i < s1.length; i++) {
            if (!map1.containsKey(s1[i])) {
                map1.put(s1[i], 1);
            } else {
                Integer s = map1.get(s1[i]);
                map1.put(s1[i], ++s);
            }
        }
        System.out.println("second loop started");
        for (int i = 0; i < s2.length; i++) {
            if (map2.get(s2[i])==null) {
                map2.put(s2[i], 1);
            } else {
                Integer s = map2.get(s2[i]);
                map2.put(s2[i], ++s);
            }
        }

        if (!map1.equals(map2)) return false;
        else return true;
    }
}
