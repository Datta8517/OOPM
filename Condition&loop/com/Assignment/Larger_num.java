package com.Assignment;

import java.util.Scanner;

public class Larger_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input three num: ");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

        System.out.println("Larger num is " + Math.max(c,Math.max(a,b)));
    }
}
