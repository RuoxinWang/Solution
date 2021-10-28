package com.company;

public class Main {
    public static void main(String[] args) {
        Moody happy = new Happy("Obj1");
        Moody sad = new Sad("Obj2");
        Psychiatrist newPsy = new Psychiatrist();
        //Happy
        newPsy.toString();
        newPsy.examine(happy);
        happy.expressFeelings();
        newPsy.observe(happy);
        //Sad
        newPsy.toString();
        newPsy.examine(sad);
        sad.expressFeelings();
        newPsy.observe(sad);
    }
}
