package com.Assignment;

import java.util.Arrays;

public class ArrShuffle {

    public static void main(String args[]){

        int[] arr = { 1,2,3,4,5,6};

        shuffle(arr, arr.length/2);
        System.out.println(Arrays.toString(shuffle(arr, arr.length/2)));
    }

    static int[] shuffle(int[] nums, int n) {
        
        int[] arr = new int[nums.length];

        int p1 =0;
        for(int i=0; i<2*n; i+=2){
            
            arr[i] = nums[p1];          // in arr of even num nums[p1] is stored
            arr[i+1] = nums[n+p1];      // In arr of odd num nums[n+p1] is stored
            p1++;
            
        }

        return arr;
    }
    
}
