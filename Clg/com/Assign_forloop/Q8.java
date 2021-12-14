package com.Assign_forloop;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ||a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
            System.out.println("Input letter is Vowel");
        }
        else if((a>='a' && a<='z') || (a>='A' && a<='Z') ){
            System.out.println("Input letter is consonant");
        }
        else{
            System.out.println("Given letter is not Vowel nor Consonant");
        }
    }
}
