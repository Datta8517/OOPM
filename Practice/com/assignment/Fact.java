package com.assignment;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num to find fact: ");
        int n =input.nextInt();
        long fac = 1;
        for(int i=n; i>=1; i--){
            fac*=i;
        }
        System.out.println(n+"! = " + fac);
    }
}
