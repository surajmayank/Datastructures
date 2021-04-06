package com.java.equalhashcode;

import java.util.Random;

public class Reportcard {
    public int getMathScore() {
        return MathScore;
    }

    private int MathScore;

    public Reportcard() {
        this.MathScore = (int) (Math.random()*101)+1;
    }
}
