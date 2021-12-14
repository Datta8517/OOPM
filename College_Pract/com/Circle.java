package com;

import java.util.Scanner;

public class Circle {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of a circle is ");
        float r = sc.nextFloat();
        Circum(r);
    }

    static void Circum(float r )
    {
        float c;

        float a =(float) ((2 * (3.14))*r);

        System.out.printf("Circumference of circle is %.2f ",a);
    }
}
