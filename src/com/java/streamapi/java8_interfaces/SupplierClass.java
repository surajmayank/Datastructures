package com.java.streamapi.java8_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
class Check{
    static  List<Integer> list = Arrays.asList(1,2,3,4,5,6,67);
    public static List<Integer> getList(){

        return list;
    }

}
public class SupplierClass {
    public static void main(String[] args) {
        Supplier<List<Integer>> check = ()->Check.getList();
        System.out.println(check.get());
    }
}
