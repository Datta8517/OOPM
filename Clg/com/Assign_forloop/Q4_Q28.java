package com.Assign_forloop;

import java.util.Scanner;

public class Q4_Q28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        if(a<0.0){
            System.out.println("Number is Negative and small");
        }
        else if(a==0.0){
            System.out.println("Number is zero");
        }
        else if(a >1000000){
            System.out.println("Number is Positive and large");
        }
        else{
            System.out.println("Number is Positive");
        }
    }
}
