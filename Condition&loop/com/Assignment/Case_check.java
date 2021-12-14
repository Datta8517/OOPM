package com.Assignment;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch= input.next().trim().charAt(2); // trim used to remove space before char and string
        // and charAt used to print pos of that char
        System.out.println(ch);

        if(ch>='a' && ch<='z')
            System.out.println("Lowercase");

        else
            System.out.println("Uppercase");
    }


}
