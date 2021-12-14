package com;

public class MagicNum {
    public static void main(String[] args){

        long n =10;
        long ans =0;
        long base = 5;
        while(n>0){
            long ld = n&1;
            ans+=ld*base;
            base*=5;
            n=n>>1;
        }

        System.out.println(ans);
    }
}
