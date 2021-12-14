package com.LeetCode;


//  Amazon ask Que
//  https://leetcode.com/problems/missing-number/
public class OneMissingElem {
    
    public static void main(String[] args){

        int[] nums = {3,0,1};

        System.out.println(sort(nums));
    }


    static int sort (int[] nums){

        int i=0;
        
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!= nums[correct]){  //we swap the nums if nums[i]<N and it's not on the correct index
                swap(nums, i , correct);
            }
            else{               // If element is on their correct pos than move i to forward
                i++;
            }
        }

        for(int index=0; index<nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }

        

        return nums.length;
    }


    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
