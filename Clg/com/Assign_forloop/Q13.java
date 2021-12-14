package com.Assign_forloop;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.printf("Number is : %d and cube of %d is : %d\n", i, i , i*i*i);
        }
    }
}
