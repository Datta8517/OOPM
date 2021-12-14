package com.Assign_forloop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        float avg =0;
        for(int i=0; i<5; i++){
            int a = sc.nextInt();
            sum+=a;
        }
        avg = (float)sum/5;

        System.out.println("Sum: " + sum + "   " + "Avg: " + avg);
    }
}
