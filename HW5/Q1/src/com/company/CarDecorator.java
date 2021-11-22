package com.company;

public class CarDecorator implements ICar{
    protected ICar newCar = null;
    protected String name = "";

    public CarDecorator(ICar car){
        this.newCar = car;
    }

    @Override
    public void assemble() {
        newCar.assemble();
        System.out.println("Adding features of " + this.name);
    }
}
