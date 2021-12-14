package com.Assignment;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=1;
        int n=input.nextInt();
        int count=2;
        while(count<=n){
            int temp = b;
            b= a+b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
