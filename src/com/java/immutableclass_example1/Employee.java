package com.java.immutableclass_example1;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;


public final class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }

    private final Integer id;
    private final String name;
    private final BigDecimal salary;
    private final Date dob;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary) && Objects.equals(dob, employee.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, dob);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Date getDob() {
        return new Date(dob.getTime());
    }
    public Employee(Integer id, String name, BigDecimal salary, Date dob) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }



}
