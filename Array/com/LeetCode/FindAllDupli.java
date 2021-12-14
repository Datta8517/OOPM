package com.LeetCode;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//Microsoft Question
import java.util.ArrayList;
import java.util.List;

public class FindAllDupli {
    
    public static void main(String[] args){

        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicate(arr));

    }

    static List<Integer> findDuplicate(int[] nums){
        int i=0;
        
        while(i<nums.length){
            int correct = nums[i]-1;
            if( nums[i]!= nums[correct]){  //we swap the nums if nums[i]<N and it's not on the correct index
                swap(nums, i , correct);
            }
            else{               // If element is on their correct pos than move i to forward
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<nums.length; index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }

        

        return ans;
    }



    static void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }



}
