package com;

import java.util.Scanner;

public class sum {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int sum=0;
        for(int i =0; i<10; i++){
            sum +=in.nextInt();
        }

        System.out.println("sum is " + sum);
    }
}
