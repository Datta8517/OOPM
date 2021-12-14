package com.Practice;

public class Shadowing {
    static int x = 45;

    static void fun(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(x);      // It print the global value of x bcoz there is no initialization of x in this block

        int x;
//        System.out.println(x);   // We only declare int but not initialize yet hence it show an error
        x=23;
        System.out.println(x);      //We actually declare the value of x in main block hence global value of x will hidden
        fun();          // It will also print the value of x mention in fun block else print global value of x
    }
}
