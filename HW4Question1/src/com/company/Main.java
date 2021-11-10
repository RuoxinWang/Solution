package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList testlist = new LinkedList();

        testlist.addAtPosition(0, 1);
        testlist.addAtPosition(1, 2);
        testlist.addAtPosition(2, 3);
        testlist.addAtPosition(3, 4);
        testlist.addAtPosition(4, 5);
        testlist.addAtPosition(5, 6);
        testlist.addAtPosition(6, 7);



        System.out.println("First Element: " + testlist.getFirst());
        System.out.println("Last Element: " + testlist.getLast());
        System.out.println("Size: " + testlist.size);

        testlist.removeAtPosition(0, 1);
        testlist.removeAtPosition(3, 4);


        System.out.println("First Element: "+ testlist.getFirst());
        System.out.println("Last Element: "+ testlist.getLast());
        System.out.println("Size: " + testlist.size);


    }
}

