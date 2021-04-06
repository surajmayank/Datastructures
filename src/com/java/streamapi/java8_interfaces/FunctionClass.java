package com.java.streamapi.java8_interfaces;

import java.util.function.Function;

public class FunctionClass {
    //return output based on the input
    public static void main(String[] args) {
        Function<Integer,String> check = t->t*10 +" multiplied by 10";
        System.out.println(check.apply(2));
    }
}
