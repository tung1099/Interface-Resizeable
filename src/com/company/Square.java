package com.company;

public class Square extends Shape implements Resizeable{
    private double side;
    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return 4*side;
    }

    @Override
    public void resize(double percent) {
        double newSide = getSide() + getSide()*percent/100;
        setSide(newSide);

    }

    @Override
    public String toString() {
        return "A square with side= " + getSide()
                + " Area = " + getArea() + " Perimeter = " + getPerimeter()
                + ", which is a subclass of "
                + super.toString();

    }
}
