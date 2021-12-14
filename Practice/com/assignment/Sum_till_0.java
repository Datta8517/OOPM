package com.assignment;

import java.util.Scanner;

/*Take input till the user enter 0 and print the sum of all the nums */
public class Sum_till_0 {
    public static void main(String[] args){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        while(n!=0){
            n = input.nextInt();
            sum= sum+n;
        }
        System.out.println("Sum is "+ sum);
    }
}
