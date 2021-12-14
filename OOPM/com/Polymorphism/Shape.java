package com.Polymorphism;

public class Shape {
    void area(){
        System.out.println("Area in the Shape");
    }

    static void greeting(){
        System.out.println("Hey! I am in Shape class.. Greetings!");
    }
}

class Circle extends Shape{
    // This will run when obj Circle is created
    //  This is a dynamic/ run time polymorphism
    @Override       // override is object dependent,   it is an annotation used to check weather it is overriding or not
    void area (){
        System.out.println("Area in Circle pie * r * r ");
    }
    double area;

    Circle(){
        System.out.println(area);
    }

    public Circle(double r){
        this.area = 3.142*r*r;
    }

    @Override
    public String toString() {
        return "Circle{" + "area=" + this.area + "}";
    }
}

class Triangle extends Shape{
    void area (){
        System.out.println("Area in Triangle 0.5 * h * b");
    }

    static void greeting(){
        System.out.println("Hey! I am in Triangle child class.. Greetings :) ");
    }
}

class Square extends Shape{
    /// when child class has the same method or function as the parent has called overriding
    void area (){
        System.out.println("Area in square r * r");
    }
}
