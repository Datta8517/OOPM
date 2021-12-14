package com;

public class PowerOf2 {
    public static void main(String[] args){
        int n = 0;

        if(n==0){
            System.out.println("False");
            return;
        }

        if((n&(n-1))==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
