package com.company;

public class Sad extends Moody {
    private String name;

    public Sad(String name) {
        this.name = name;
    }

    @Override
    public String getMood() {
        return "I feel sad Today";
    }

    @Override
    public void expressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    public String toString() {
        return this.name + " cries a lot";
    }
}
