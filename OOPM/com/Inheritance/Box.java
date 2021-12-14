package com.Inheritance;

public class Box {

    double l;
    double h;
    double w;
    double weight;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
        this.weight = 1;
    }

    // cube

    // this is an overloading,    when same constructor calling different variable or datatype called overloading
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(double l, double h, double w, double weight){
        this.l = l;
        this.w = w;
        this.h = h;
        this.weight = weight;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void info(){
        System.out.println("Running the Single inheritance Box constructor");
    }
}

class Boxweight extends Box{
    double weight ;

    Boxweight(){
        weight = -1;
    }

    Boxweight(double l, double h, double w, double weight) {
        super(l, h, w);         // calling parent class constructor for the given parameter
        this.weight = weight;
    }

    public Boxweight(double l, double h, double w, double weight, double weight1) {
        super(l, h, w, weight);
        /// when both parent and child has same variable then to access the parent variable use super. and for child variable use this.
        this.weight = weight1;

        System.out.println("Example of accessing same variable from both of the class with different value");
        System.out.println(super.weight + "  " + this.weight);

    }
}
