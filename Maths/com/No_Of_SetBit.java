package com;

// Given a no. of n , and find the no. of set bit in it;
public class No_Of_SetBit {
    public static void main(String[] args){
        int o_n = 234567;
        int  n = o_n;
        int cnt =0;
        System.out.println(Integer.toBinaryString(n));
//        while(n>0){
//            if((n&1)==1){
//                cnt++;
//            }
//            n= n>>1;
//        }
        while(n>0){
            n= n &(n-1);
            cnt++;
        }
        System.out.println("1's in "+o_n + " = "+cnt);

    }
}
