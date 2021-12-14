package com.Assign_forloop;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        int i =1;
        while(n>0){
            if(i%2==1){
                System.out.println(i);
                i+=2;
            }
            n--;
        }
        System.out.println("Sum : " + count*count);
    }
}
