package com.company;

public class Sad extends Moody {
    private String name;
    public Sad(String name) {
        this.name = name;
    }

    @Override
    public String getMood() {
        return "I feel Sad Today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("‘Waah’ ‘Boo Hoo’ ‘Weep’ ‘Sob’");
    }

    public String toString() {
        return this.name + " cries a lot";
    }
}
