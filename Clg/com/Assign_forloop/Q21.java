package com.Assign_forloop;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            int space = row-i;
            for(int j = space ; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print('*' + " ");
            }
            System.out.println();
        }
        for(int i=row; i>=1; i--){
            int space = row-i;
            for(int j = 0 ; j<=space+1; j++){
                System.out.print(" ");
            }
            for(int j=i-1; j>=1; j--){
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
