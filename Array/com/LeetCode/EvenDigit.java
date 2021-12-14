package com.LeetCode;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(Even(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }

    static int Even(int nums){
        int count =0;

        while(nums>0){
            count ++;
            nums/=10;
        }

        return count;
    }
}
