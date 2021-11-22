package com.company;

public class CreditCardStrategy implements PaymentStrategy{
    public String cardNumber;
    public CreditCardStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int price) {
        System.out.println("Credit Card: $" + price);
    }
}
