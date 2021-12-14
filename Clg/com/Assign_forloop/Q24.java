package com.Assign_forloop;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            int space = row-i;
            for(int j = space ; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print('@' + " ");
            }
            System.out.println();
        }
    }
}
