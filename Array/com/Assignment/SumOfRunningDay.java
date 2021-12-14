package com.Assignment;

import java.util.Arrays;

/* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]

Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]. */

public class SumOfRunningDay {
    
    public static void main(String args[]){
        int[] arr = {1,2,3,4};

        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums){
        int sum=0;

        int[] runningsum = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            runningsum[i] = sum;
        }

        return runningsum;
    }
    
}