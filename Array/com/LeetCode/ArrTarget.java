package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrTarget {
    public static void main(String[] args){

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
        

    }

    static int[] createTargetArray(int[] nums, int[] index) {
     
        List<Integer> ip = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            ip.add(index[i], nums[i]);
        }

        int[] op = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            op[i] =  ip.get(i);
        }

        return op;
    }
}
