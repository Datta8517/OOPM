package com.Assignment;

import java.util.Scanner;

public class Fibo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a=0; int b=1;
        int c;

        System.out.print(a+" "+ b);  //print used to output result in horizontal
                                    // println used to output result and break line for nxt result
        for(int i=2; i<=n; i++){
            c=a+b;
            a= b;
            b=c;
            System.out.print(" "+ c);
        }
    }
}
