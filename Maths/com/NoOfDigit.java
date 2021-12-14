package com;

public class NoOfDigit {

    public static void main(String[] args){
        int n = 10686;
        int base = 2;
        int ans = (int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
}
