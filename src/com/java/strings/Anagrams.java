package com.java.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void main(String args []){
        String s= "geeksforgeaks";
        String s1="forgeeksgeeks";
        boolean check= getanagram(s,s1);
        if(check==true){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }

    }

    private static boolean getanagram(String c, String d) {
        if (c.length() != d.length())
            return false;

        int count = 0;

        // Take sum of all characters of
        // first String
        for(int i = 0; i < c.length(); i++)
        {
            System.out.println(c.charAt(i));
            count = count + c.charAt(i);
            System.out.println(count);
        }

        // Subtract the Value of all the characters
        // of second String
        System.out.println("second loop started");
        for(int i = 0; i < d.length(); i++)
        {
            System.out.println(c.charAt(i));
            count = count - d.charAt(i);
            System.out.println(count);
        }

        // If Count = 0 then they are anagram
        // If count > 0 or count < 0 then
        // they are not anagram
        return (count == 0);
    }
}
