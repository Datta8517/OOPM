package com.staticExample;

public class Human {
    int age;
    String name;
    int sal;
    boolean status;
    static long population;

    // things which are not related to an object is called static or the thing which is same for all in universe called static

    Human(int age, String name, int sal, boolean status){
        this.age = age;
        this.name = name;
        this.sal = sal;
        this.status = status;
        Human.population +=1;  // whenever to access static var use class name instead of this. bcoz it is universally same for all
    }
}
