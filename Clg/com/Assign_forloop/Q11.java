package com.Assign_forloop;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum =0;
        for(int i=1; i<=n; i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Sum: " + sum);

    }
}
