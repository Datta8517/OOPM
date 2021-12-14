package com.LeetCode;

import java.util.Arrays;

public class sumOfRunningDay {

    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        runningSum(arr);

        System.out.println(Arrays.toString(runningSum(arr)));
        
    }

    static int[] runningSum(int[] nums){
        int[] runningSums = new int[nums.length];
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            runningSums[i] = sum;
        }
        return runningSums;
    }
    
}
