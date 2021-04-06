package com.java.strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'perfectSubstring' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */
public static boolean getPerfectString(String str,int k){
    Map<Character , Integer> map = new HashMap<>();
    System.out.println("String "+str);
    char [] c = str.toCharArray();
    for(int i=0;i<c.length;i++){
        if(map.get(c[i])==null){
            map.put(c[i], 1);
        }else{
            int value = (int) map.get(c[i]);
            map.put(c[i], ++value);
        }
    }
    for(Map.Entry<Character,Integer> v:map.entrySet()){
        if(v.getValue()!=k){
            return false;
        }
    }
    return true;
}
    public static int perfectSubstring(String s, int k) {
    // Write your code here
   int count=0;
    for(int i=0;i<s.length();i++){
        for(int j=i+1;j<s.length()+1;j++){
            if(getPerfectString(s.substring(i,j),k)){
                count++;
            }
        }
    }
return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
       int count = Result.perfectSubstring("1020122",2);
       System.out.println("count" +count);

    }
}