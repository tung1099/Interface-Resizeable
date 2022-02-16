package com.company;

public class Circle extends Shape implements Resizeable{
    private double radius;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public void resize(double percent) {
        double newRadius = getRadius() + getRadius()*percent/100;
        setRadius(newRadius);
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius()
                + " Area = " + getArea() + " Perimeter = " + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
