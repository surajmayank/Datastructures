package com.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StrimApi {

    public static void main(String args []) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5,6);
        System.out.println(values.stream().map(i->i*2).collect(Collectors.toList()));
        values.forEach(System.out::println);


       System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
        System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));

        OptionalDouble avg = values.stream().mapToInt(n -> n * 2).filter(n -> n > 1).average();

                OptionalDouble avg1 =values.stream().mapToInt(i-> i*i).filter(i->i>100).average();

                System.out.println("avarage "+ avg);


    }

}
