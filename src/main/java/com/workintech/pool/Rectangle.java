package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if(width < 0 || length <0 ){
            this.width=0;
            this.length=0;

        } else{
            this.width = width;
            this.length = length;
        }
    }
/*
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }*/

    public double getWidth() {
        return width;
    }


    public double getLength() {
        return length;
    }


    public double getArea(){
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
