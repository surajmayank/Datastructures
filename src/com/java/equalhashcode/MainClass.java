package com.java.equalhashcode;

import com.java.immutableclass_example1.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("H234");
        Student s2 = new Student("H234");
        System.out.println(s1.equals(s2));
        Student s3 = (Student) s1.clone();
        System.out.println("clone object "+s3.getRegistrationNumber());


        Map<Student, Reportcard> studentReportcardMap = new HashMap<>();
        studentReportcardMap.put(s1, new Reportcard());
        studentReportcardMap.put(s2, new Reportcard());
        studentReportcardMap.entrySet().stream().forEach(i -> System.out.println(i.getKey().getRegistrationNumber() + " " + i.getValue().getMathScore()));
    }
}