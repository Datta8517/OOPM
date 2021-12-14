package com.Assign_forloop;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int digit=0;
        while(n>0){
            digit++;
            n/=10;
        }
        System.out.println(digit);
    }
}
