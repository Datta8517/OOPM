package com;

import java.util.Scanner;

public class AsciiVal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(n + " is Ascii value of " + (char)n);
    }
}
