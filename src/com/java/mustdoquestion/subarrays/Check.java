package com.java.mustdoquestion.subarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {
    public static int min(List<Integer> segment){
        if(segment.size()<=1){
            return segment.get(0);
        }
        int min = segment.get(0);
        for(int i=1;i<segment.size();i++){
            if(segment.get(i)<min)
                min=segment.get(i);
        }
        return min;
    }
    public static int max(List<Integer> minValueArray){
        int max = minValueArray.get(0);
        for(int i=1;i<minValueArray.size();i++){
            if(minValueArray.get(i)>max)
                max=minValueArray.get(i);
        }
        return max;
    }

    public static int segment(int x, List<Integer> space) {
        List<Integer>[]segments = new List[space.size()];
        List<Integer> listSigment = null;
        List<Integer> minValueArray=new ArrayList<>();
        int k=0;
        for(k=0;k<space.size();k++){
            listSigment=new ArrayList<>();
            for(int i=k;i<x;i++){
                if(x>space.size()){
                    break;
                }
                listSigment.add(space.get(i));
            }
            if(x<=space.size()) {
                segments[k] = listSigment;
                minValueArray.add(min(segments[k]));
            }
            x++;
        }

        return max(minValueArray);
    }
    public static void main(String args[]){
        List<Integer>space= Arrays.asList(2,5,4,6,8);
        int x=3;
        int result = Check.segment(x, space);
        System.out.println(result);
    }
}

