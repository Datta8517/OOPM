package com.Polymorphism;

public class Main {
    public static void main(String[] args) {

        // If type is parent class but obj is child class then if u called the function from parent, but this function is same in child class then it called to the child class function
        // It means it override the parent class function

        Shape s = new Shape();
        Circle c = new Circle(5);
        Shape t = new Triangle();
        Shape sqr = new Square();

//        c.area();

//        System.out.println(c);

        // static is class dependent function , so we called static function from its reference datatype not from object
        Shape s1 = new Shape();

        s1.greeting();

        Shape s2 = new Triangle();
        s2.greeting();

        Triangle t1 = new Triangle();
        t1.greeting();
    }
}
