package com.LeetCode;

public class SetMismatch {
    
    public int[] findErrorNums(int[] nums) {
        int i=0;
        
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!= nums[correct]){  //we swap the nums if nums[i]<N and it's not on the correct index
                swap(nums, i , correct);
            }
            else{               // If element is on their correct pos than move i to forward
                i++;
            }
        }

        for(int index=0; index<nums.length; index++){
            if(nums[index] != index+1){
                return new int[] {nums[index], index+1};
            }
        }

        return new int[] {-1,-1};
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
