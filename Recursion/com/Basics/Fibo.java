package com.Basics;

public class Fibo {
    public static void main(String[] args){
        
        int ans = checkFibo(6);
        System.out.println(ans);
    }

    static int checkFibo(int n){
        if(n<2){
            return n;
        }

        return checkFibo(n-1) + checkFibo(n-2);
    }
    
}
