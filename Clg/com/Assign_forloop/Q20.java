package com.Assign_forloop;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int row = sc.nextInt();
        int k =1;

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
