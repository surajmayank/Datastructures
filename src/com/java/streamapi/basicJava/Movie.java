package com.java.streamapi.basicJava;

public class Movie implements Comparable<Movie> {

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public float getRating() {
        return rating;
    }

    public Movie(String name,float rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;

    }

    private  String name;
    private int year;
    private float rating;

    @Override
    public int compareTo(Movie m) {
        return this.year-m.year;
    }
}
