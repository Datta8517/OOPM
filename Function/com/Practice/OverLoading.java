package com.Practice;
// Overloading : fun of similar name like example demo in below
// if there is multiple fun of same name then datatype call by fun should be different
public class OverLoading {

    static void demo(int a, int b){
        System.out.println(a+b);
    }

    static void demo(int a, int b, int c){
        System.out.println(a+b == c);
    }

    static void demo(String name){
        System.out.println("Jamkhande " + name);
    }

    public static void main(String[] args) {
        String Name = "Dattatray";
        demo(20,32);
        demo(Name);
        demo(5,3,8);
//        demo();     // braces of the calling fun should not be empty else it shows error
    }
}