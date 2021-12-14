package com.Practice;

import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        System.out.println(sum());
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = in.nextInt();
        System.out.print("Enter num2: ");
        int n2 = in.nextInt();
        System.out.print("Sum is: ");
        int sum = n1 + n2;

        return sum;
    }
}
