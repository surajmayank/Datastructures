package com.java.streamapi.java8_interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorClass {
    // aggregate the value and return single output;
    public static void main(String[] args) {
        BinaryOperator<Integer> output = (a,b)->a+b;
        System.out.println(output.apply(2,3));
    }
}
