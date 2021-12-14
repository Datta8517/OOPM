package com;

public class Range_xor {
    public static void main(String[] args){
        int a = 3;
        int b = 9;

        // for range from a to b just find the xor from 0 to b and xor it with 0 to a-1;
        int ans = Xor(b)^Xor(a-1);
        System.out.println(ans);

//        // Xor from 0 to c
//        int c = 14;
//        System.out.println(Xor(c));
    }

    // This operation is done in O(1) time complexity;
    static int Xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        return 0;
    }
}
