package com.Assign_forloop;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<=10; i++){
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }
}
