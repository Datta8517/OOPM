package com;

public class PeakOfMountain {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,3,1};
        int st = 0;
        int en = nums.length - 1;
        int md = 0;
        while(st<en){
            int mid = st + (en-st)/2;
            if(nums[mid]>nums[mid+1]){
                //If nums[mid] is > than nxt one then it may be the best possible ans
                //then check weather is > than prev elem or not in nxt condition
                //maybe it is in descending order also
                //in descending order nxt ele of mid is always lower
                en = mid;
            }
            else {
                //In this condition elem of mid is < than nxt one
                //It means given condition is in ascending order
                st = mid+1;
            }
            md = mid;
        }

        System.out.println(st);
    }
}
