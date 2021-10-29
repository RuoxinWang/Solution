package com.company;

public class Client {
    public static void main(String[] args) {
        Context add = new Context(new AddOperation());
        Context sub = new Context(new SubtractOperation());
        Context mul = new Context(new MultiplyOperation());

        System.out.println("Result of 5 add 15 is: " +add.execute(5, 15));
        System.out.println("Result of 50 minus 40 is: " +sub.execute(50, 40));
        System.out.println("Result of 4 times 25 is: " +mul.execute(4, 25));
    }
}
