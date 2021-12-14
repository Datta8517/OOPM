package com.Assign_forloop;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int k=1;
            for(int j=1; j<=n; j++){
                if(j<=n-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print((char)(k+64) +" ");
                    k++;
                }
            }
            int m = i;
            for(int j=n-1; j>n-i; j--){
                System.out.print((char)(63+m) + " ");
                m--;
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            int k=1;
            for(int j=1; j<=n; j++){
                if(j<=n-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print((char)(k+64) +" ");
                    k++;
                }
            }
            int m = i;
            for(int j=n-1; j>n-i; j--){
                System.out.print((char)(63+m) + " ");
                m--;
            }
            System.out.println();
        }
    }
}
