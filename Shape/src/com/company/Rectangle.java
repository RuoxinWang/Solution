package com.company;

public class Rectangle extends Shape{
    public int side;
    public int width;
    public int height;

    public Rectangle(String name, String color, int width, int height){
        super(name, color);
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public int getArea(){
        super.getArea();
        int area = 0;
        int width = getWidth();
        int height = getHeight();
        int side = getSide();
        if(width != 0 ){
            area = width * height;
        }else{
            area = side * side;
        }
        return area;
    }

    public int getPerimeter(){
        super.getPerimeter();
        int perimeter = 0;
        int width = getWidth();
        int height = getHeight();
        int side = getSide();
        if(width != 0){
            perimeter = width + width + height + height;
        }else{
            perimeter = side * 4;
        }
        return perimeter;
    }


}
