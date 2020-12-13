package com.java.lamdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPhone {

    public static void main(String args []){

        Phone p = new Phone() {
            @Override
            public void show() {
                System.out.println("old way to implement the interfaces method");
            }
        };
        p.show();
        Phone p1 = () -> System.out.println("lambda Expression");
        p1.show();
        System.out.println("hello madam");


        Function<Integer, Integer> adder = (value) -> value+7;
        Integer result = adder.apply((Integer)9);
        System.out.println(result);

        Predicate pre = (value) -> value !=null;
        boolean b = pre.test(1);
        System.out.println("predicate "+b);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

       /* Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println(o);
            }
        };
        Consumer<Integer> c1 = i -> System.out.println("Consumer"+i);*/

        list.forEach(System.out::println);
      //  list.forEach(c);


        //alternate of the above

        list.forEach(i -> System.out.println(i));
        list.forEach(System.out::println); //method reference


        list.forEach(i -> multi(i)); //lambda expression
        list.forEach(TestPhone::multi);//method reference

        System.out.println("values"+list.stream().filter( i -> i%2==0).map(i -> i*i).reduce(0,(x,y)-> sum(x,y)));


    }

    private static Integer sum(Integer x, Integer y) {
        return x+y;
    }

    public static void multi(int i){
        System.out.println(i*2);
    };
}
