package com.company;

import com.sun.xml.internal.ws.message.PayloadElementSniffer;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shoppingCart;
    private int totalPrice;

    public ShoppingCart(){
        shoppingCart = new ArrayList<>();
    }

    public void addItem(Item item){
        shoppingCart.add(item);
    }

    public void removeItem(Item item){
        shoppingCart.remove(item);
    }

    public int calculateTotal(){
        totalPrice = 0;
        for(Item item: shoppingCart){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }
}
