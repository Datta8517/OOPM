package com.staticExample;

public class Main2
{
    public static void main(String[] args) {

//        greet();

        check();
        Main2 ob = new Main2();
        ob.sample();
    }

    static void check(){

//        greet();  // we cant use this bcoz it requires an instance;
        // and the check() method is object independent so we cant access the instance in static


        // I can't access the non-static stuff without referencing their instances to a static context
        // To run the non-static stuff, this stuff should be a static or an object. So here we create an obj to access it
        Main2 obj = new Main2();
        obj.greet();

    }

    void sample(){
        greet();
    }

    // we know that something which is non-static belongs to an instance / object
    void greet(){       // we can't access the non-static method in static method
        System.out.println("Hello System, its me!!");
    }
}
