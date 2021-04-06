package com.java.immutableclass_example1;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeTest {

    private static Date getDob(String dob){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(dob);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {

        Employee e1 = new Employee(1001,"Rahul", new BigDecimal(9000.00),getDob("11/12/1995"));
        Employee e2 = new Employee(1002,"Suraj", new BigDecimal(4000.00),getDob("12/11/1971"));
        Employee e3 = new Employee(1003,"Khusi", new BigDecimal(6000.00),getDob("13/09/1976"));
        Employee e4 = new Employee(1004,"Kajal", new BigDecimal(8000.00),getDob("14/07/1985"));


        ConcurrentHashMap <Employee,String> empmap = new ConcurrentHashMap<>();
        empmap.put(e1,"IT");
        empmap.put(e2,"FINANCE");
        empmap.put(e3,"IT");
        empmap.put(e4,"FINANCE");

//        empmap.entrySet().stream().forEach(i->System.out.println(i.getKey() +" "+i.getValue()));
//
//        e1.getDob().setTime(98765423l);
//
//        System.out.println("after changing the value of the e1 dob");
//
//        empmap.entrySet().stream().forEach(i -> System.out.println(i.getKey()+""+i.getValue()));

        Set<Map.Entry<Employee, String>> entrySet = empmap.entrySet();

        for (Map.Entry<Employee, String> entry : entrySet) {
            Employee employee = entry.getKey();
            String dept = entry.getValue();
            System.out.println(employee);
            System.out.println(dept);
        }
        System.out.println("--------------------------------------");
        e1.getDob().setTime(8988878787L);
        System.out.println(e1);
        System.out.println(empmap.get(e1));




    }


}
