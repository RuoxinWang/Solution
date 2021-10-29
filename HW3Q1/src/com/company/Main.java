package com.company;

public class Main {
    public static void main(String[] args) {
        Moody happyMoody = new Happy("Obj1 with Happy Moody");
        Moody sadMoody = new Sad("Obj2 with Sad Moody");
        Psychiatrist newPsy = new Psychiatrist();
        //Happy
        newPsy.toString();
        newPsy.examine(happyMoody);
        happyMoody.expressFeelings();
        newPsy.observe(happyMoody);
        //Sad
        newPsy.toString();
        newPsy.examine(sadMoody);
        sadMoody.expressFeelings();
        newPsy.observe(sadMoody);
    }
}
