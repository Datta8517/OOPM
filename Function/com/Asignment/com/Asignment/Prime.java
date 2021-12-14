package com.Asignment;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Prime {

    static boolean isPrime(int a){
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%2==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
