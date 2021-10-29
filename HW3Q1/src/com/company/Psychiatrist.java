package com.company;

public class Psychiatrist {
    public void examine(Moody moodyObject) {
        System.out.println(moodyObject.getMood());
    }

    public void observe(Moody moodyObject) {
        System.out.println("Observation: " + moodyObject.toString());
    }

    public String toString() {
        System.out.println("How are you feeling today?");
        return "How are you feeling today?";
    }
}
