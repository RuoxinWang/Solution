package com.company;

public class Happy extends Moody{
    public String name;

    public Happy(String name) {
        this.name = name;
    }


    @Override
    public String getMood() {
        return "I feel happy Today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeehee….hahahah…HAHAHA!!");
    }

    public String toString() {
        return this.name + " laughs a lot";
    }
}

