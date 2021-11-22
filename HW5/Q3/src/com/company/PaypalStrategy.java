package com.company;

public class PaypalStrategy implements PaymentStrategy{
    public String email;
    public PaypalStrategy(String email){
        this.email = email;
    }

    @Override
    public void pay(int price) {
        System.out.println("PayPal: $" + price);
    }
}
