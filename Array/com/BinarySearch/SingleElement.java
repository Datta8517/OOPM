package com.BinarySearch;

public class SingleElement {
    public static void main(String[] args){
        int[] arr = {2,2,1,1,3,4,4,8,8,5,5};
        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[] nums) {

        if(nums.length ==1){
            return nums[nums.length-1];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!= nums[nums.length-2]){
            return nums[nums.length-1];
        }

        int st =0;
        int en = nums.length-1;
        int mid;

        while(st<=en){
            mid = st + (en-st)/2;
            // if ele at mid == mid -1 then check for left part of the array till mid >0
            if(mid>0 && nums[mid]==nums[mid-1]){
                if(mid%2==0){
                    en= mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            // if ele at mid == mid+1 then check for the right part of the array till mid < length of the array
            else if(mid < nums.length-1 && nums[mid]==nums[mid+1]){
                if(mid%2 == 0){
                    st = mid+1;
                }
                else{
                    en = mid-1;
                }
            }
            // if ele at mid != mid+1 && ele at mid != mid-1 also st<= en then return nums[mid]
            else{
                return nums[mid];
            }
        }
        return -1;
    }
}
