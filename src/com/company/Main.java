package com.company;

public class Main {

    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(12,20);
        shapes[2] = new Square(15);

        System.out.println("Pre- size:");
        System.out.println(shapes[0]);
        System.out.println(shapes[1]);
        System.out.println(shapes[2]);

        for (Shape shape:shapes
             ) {
            if (shape instanceof Circle)
                ((Circle)shape).resize(20);
            if (shape instanceof Rectangle)
                ((Rectangle)shape).resize(30);
            if (shape instanceof Square)
                ((Square)shape).resize(50);
            
        }
        System.out.println("After- size:");
        System.out.println(shapes[0]);
        System.out.println(shapes[1]);
        System.out.println(shapes[2]);
    }
}
