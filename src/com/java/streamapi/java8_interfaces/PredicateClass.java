package com.java.streamapi.java8_interfaces;

import java.util.function.Predicate;

public class PredicateClass {
//predicate functional interface
    //returns the boolean value
    public static void main(String[] args) {
        Predicate<String> checkLength = i-> i.length()>5;
        System.out.println(checkLength.test("hell"));
    }
}
