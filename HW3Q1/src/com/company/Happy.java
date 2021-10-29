package com.company;

public class Happy extends Moody{
    public String name;
    public Happy(String name) {
        this.name = name;
    }


    @Override
    public String getMood() {
        return "I feel Happy Today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeeheehe….hahahahahaha…HAHAHA!!");
    }

    public String toString() {
        return this.name + " laughs a lot";
    }
}

