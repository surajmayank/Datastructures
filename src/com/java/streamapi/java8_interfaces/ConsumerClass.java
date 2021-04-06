package com.java.streamapi.java8_interfaces;

import java.util.function.Consumer;

class Person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
public class ConsumerClass {
    //only modifies the values don't return anything

    public static void main(String[] args) {
        Person p = new Person();
        Consumer<Person> setName = t->t.setName("java class");
        setName.accept(p);
        System.out.println(p.getName());
    }
}
