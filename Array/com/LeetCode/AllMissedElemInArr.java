package com.LeetCode;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// ask in google
import java.util.ArrayList;
import java.util.List;

public class AllMissedElemInArr {

    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println((findDisappearedNumbers(nums)));
        
    }


    // for cyclic sort, element of nums should be from 1 to N;
    static List<Integer> findDisappearedNumbers(int[] nums){
        int i=0;
        
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!= nums[correct]){  //nums[i] should be == nums[nums[i] - 1]; if not then swap of element of the i(th) pos to the
                                        // pos of (i)th elem -1; 
                swap(nums, i , correct);
            }
            else{               // If element is on their correct pos than move i to forward
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index=0; index< nums.length; index++){

            if(nums[index]!=index+1){
                ans.add(index+1);
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
