package com.Assign_forloop;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double determinant = Math.sqrt(b*b - 4*a*c);

        if(determinant>0){
            System.out.printf("%.3f",((-b + determinant)/(2*a)) + "\n");
            System.out.printf("%.3f",((-b - determinant)/(2*a)) + "\n");
        }
        else if(determinant==0){
            System.out.printf("%.3f", (-b/(2*a)) + "\n");
        }
        else{
            double real = -b/(2*a);
            double imaginary = Math.pow(-1*determinant,0.5)/(2*a);

            System.out.printf("%.3f+i%.3f;", real ,imaginary);
            System.out.printf("\n%.3f-i%.3f;", real ,imaginary);
        }
    }
}
