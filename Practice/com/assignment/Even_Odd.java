package com.assignment;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check even or odd: ");
        int n = input.nextInt();

        if(n%2==0)
            System.out.println("Even num");
        else
            System.out.println("Odd num");
    }
}
