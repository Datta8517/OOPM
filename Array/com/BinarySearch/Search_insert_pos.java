package com.BinarySearch;

public class Search_insert_pos {
    public static void main(String[] args){
        int[] arr = {1,3,5,6};
        int target = 2;
        int ans = searchInsert(arr, target);
        System.out.println(ans);
    }

    static int searchInsert(int[] nums, int target){
        int st = 0;
        int en = nums.length -1;

        while(st<=en){
            int mid = st + (en - st)/2;

            if(nums[mid]== target){
                return mid;
            }
            else if(nums[mid]<target){
                st = mid+1;
            }
            else{
                en = mid-1;
            }
        }

        return st;
    }
}
