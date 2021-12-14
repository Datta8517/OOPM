package com.Basics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the num to check it is prime or not : ");
        int num = in.nextInt();
        boolean flag = true;
        if(num==1){
            System.out.println("Given num is neither prime nor composite");
            return;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                System.out.println("Not a prime");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("It is a prime");
        }

        return;
    }
}
