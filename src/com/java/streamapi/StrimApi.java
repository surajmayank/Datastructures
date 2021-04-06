package com.java.streamapi;

import com.sun.applet2.AppletParameters;

import java.util.*;
import java.util.stream.Collectors;

public class StrimApi {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6,15,12,13,21,19);

        System.out.println(values.stream().map(i -> i * 2).collect(Collectors.toList()));
        values.forEach(System.out::println);


        System.out.println(values.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
        System.out.println(values.stream().map(i -> i * 2).reduce(0, Integer::sum));

        OptionalDouble avg = values.stream().mapToInt(n -> n * 2).filter(n -> n > 1).average();

        OptionalDouble avg1 = values.stream().mapToInt(i -> i * i).filter(i -> i > 100).average();

        System.out.println("avarage " + avg);

        values.stream().sorted().forEach(System.out::println);

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String,Long> counterMap = items.stream().collect(Collectors.groupingBy(i -> i,Collectors.counting()));
        System.out.println(counterMap);

        Map<String,Long> finalMap = new LinkedHashMap<>();

        counterMap.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEachOrdered(i -> finalMap.put(i.getKey(),i.getValue()));
        System.out.println(finalMap);

    }

}
