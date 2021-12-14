package com.LeetCode;

import java.util.Arrays;

public class N_unique_sumUpto0 {
    
    public static void main(String[] args){

        int n = 6;

        System.out.println(Arrays.toString(nUnique(n)));
    }

    static int[] nUnique(int n){

        int[] nums = new int[n];

        for(int i=1; i<n; i+=2){
            nums[i-1] = i;
            nums[i] = -i;
        }

        return nums;
    }
}
