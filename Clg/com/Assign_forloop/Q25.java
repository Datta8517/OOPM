package com.Assign_forloop;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int k=i;
            for(int j=1; j<=n; j++){
                if(j<=n-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print(k +" ");
                    k--;
                }
            }
            k=2;
            for(int j=n-i; j<n-1; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            int k=i;
            for(int j=1; j<=n; j++){
                if(j<=n-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print(k +" ");
                    k--;
                }
            }
            k=2;
            for(int j=n-i; j<n-1; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
