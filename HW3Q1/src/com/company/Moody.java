package com.company;

public abstract class Moody {


    abstract String getMood();


    abstract void expressFeelings();


    public void queryMood(String mood) {
        System.out.println("I feel Question1." + mood + " today!!");
    }
}