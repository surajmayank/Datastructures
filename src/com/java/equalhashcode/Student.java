package com.java.equalhashcode;

import java.util.Objects;

public class Student implements Cloneable {
    public Student(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if(o!=null && o instanceof Student){
            String regNumber = ((Student)o).getRegistrationNumber();
            if(regNumber!=null && regNumber.equals(this.registrationNumber));
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }

    private String registrationNumber;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
