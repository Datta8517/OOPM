package com.Asignment;

import java.util.Scanner;

public class EvenOdd {

    static String check(int n){
        if(n%2==0)
            return "Even";

        else
            return "Odd";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ans = check(n);
        System.out.println(ans);
    }
}
