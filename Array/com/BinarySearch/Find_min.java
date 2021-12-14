package com.BinarySearch;

public class Find_min {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(Rot_sorted(arr));

    }

    static int Rot_sorted(int[] arr){
        int st = 0;
        int en = arr.length-1;

        // if array is not rotated than return arr[0]
        if(arr[st]<=arr[en]){
            return arr[0];
        }
        while(st<=en){
            int mid = st + (en-st)/2;
            if(arr[mid]> arr[mid+1]){
                return arr[mid+1];
            }
            if(arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid]>=arr[st]){
                st = mid+1;
            }
            else if(arr[mid]<= arr[en]){
                en = mid-1;
            }
        }
        return-1;
    }
}
