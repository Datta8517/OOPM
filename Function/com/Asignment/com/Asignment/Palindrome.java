package com.Asignment;

import java.util.Scanner;

public class Palindrome {

    static boolean palindrome(int n){
        int temp = n;
        int palind = 0;

        while(n>0){

            int lastdigit= n%10;
            palind = palind*10 + lastdigit;
            n/=10;
        }

        if(temp == palind){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if(palindrome(n)){
            System.out.println("Yes num is Palindrome");
        }
        else
            System.out.println("No, num is not Palindrome");

    }
}
