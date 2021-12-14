package com.Assignment;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int ans=0;

        while(n>0){
            int lastdigit = n%10;
            ans= ans*10 + lastdigit;
            n/=10;
        }

        System.out.println(ans);
    }
}
