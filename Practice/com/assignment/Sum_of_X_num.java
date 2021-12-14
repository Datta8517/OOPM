package com.assignment;

import java.util.Scanner;

public class Sum_of_X_num {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int ans=0;
        for(int i=1; i<=x; i++){
            ans+= i;
//            System.out.println(ans);
        }
        System.out.println("Sum of X num is "+ ans);

    }
}
