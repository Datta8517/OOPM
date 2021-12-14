package com.Assignment;

public class PairOfNum {

    public static void main(String args[]){
        int[] arr = {1,1,1,1};

        System.out.println(numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] nums) {
        int sum=0;
        
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if((i<j)  && (nums[i] == nums[j])){
                    sum++;
                }
            }
        }
        

        return sum;
    }
    
}
