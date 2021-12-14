package com;

import java.util.Scanner;

public class Check_even {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n&1)==1){
            System.out.println("number is Odd");
        }
        else
            System.out.println("Number is even");
    }

}
