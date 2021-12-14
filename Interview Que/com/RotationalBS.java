package com;

public class RotationalBS {

    //////  ARRAY SHOULD BE SORTED TO APPLY BINARY SEARCH
    public static void main(String[] args){

        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums , int target){

        int pivot = findPivot(nums);

        if(pivot == -1){
            //It means given arr is not rotaional use simple BS
            return BinarySearch(nums,target , 0, nums.length -1);
        }
        if(nums[pivot] == target){
            return pivot;
        } 

        if(target >= nums[0]){
            return BinarySearch(nums,target , 0, pivot-1);
        }
        else{
            return BinarySearch(nums,target , pivot+1, nums.length -1);
        }
    }

    static int BinarySearch(int[] arr, int target, int st, int en){

        while(st<=en){
            int mid = st + (en-st)/2;

            if(target< arr[mid]){
                en = mid-1;
            }
            else if(target > arr[mid]){
                st = mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

    static int findPivot(int[] arr){
        int st =0;
        int en = arr.length-1;

        while(st<=en){

            int mid = st + (en-st)/2;
            // If elem of the mid is greater than nxt one it means mid elem is pivot
            if(mid<en && arr[mid]>arr[mid+1]){
                return mid;
            }
            //elem of mid is less than mid-1 then mid -1 is pivot
            if(mid> st && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            // if arr obey the above case than short the arr
            // 1) if mid elem is <= arr of start than shift en to mid -1
            // bcoz pivot is betwn st to mid
            if(arr[mid]<= arr[st]){
                en = mid-1;
            }
            //if arr of start is <= arr of mid than shift start to mid +1;
            // bcoz pivot is betwn mid to en  
            else{
                st = mid +1;
            }
        }

        return -1;
    }
    
}
