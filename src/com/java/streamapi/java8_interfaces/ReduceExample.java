package com.java.streamapi.java8_interfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");
        Stream<String> str = Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println(str.reduce((a,b)->a+b));

        Optional<String> longString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
        longString.ifPresent(System.out::println);

        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,6,5,4,3,2,1);

        Optional<Integer>value = Optional.ofNullable(values.stream().filter(i -> i > 2).map(i -> i * 2).reduce(0, (a, b) -> Integer.sum(a, b)));
        System.out.println(value);

        try {
            String str1 = Files.lines(Paths.get("\\var\\config\\migration\\service\\DigitalupcProvisionRequest.json")).map(i-> i.replace("change_tenant","helloWorld")).collect(Collectors.joining("\n"));
            System.out.println(str1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
