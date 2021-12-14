package com.Basics;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Roll no.");
        int rollno = input.nextInt();   //34
        char letter = 'c';              //c
        System.out.println("Input marks");
        float marks = 2.3f;                    //231.3423f
        System.out.println("Input Largest decimal number");
        double largeDecimalNumber = input.nextDouble();     //23123.3213242342
        System.out.println("Input Longest integer");
        long largeInt = input.nextLong();                   //42048209380918L
        System.out.println("Roll no. is " + rollno);
        System.out.println("Letter is " + letter);
        System.out.println("Your marks is " + marks);
        System.out.println("Largest decimal number is " + largeDecimalNumber);
        System.out.println("Longest integer is " + largeInt);
    }

}
