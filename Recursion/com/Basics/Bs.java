package com.Basics;

public class Bs {
    public static void main(String[] args){
        int[] arr = {2,11,16,24,31,54,66};
        int key= 77;

        System.out.println(search(arr, key, 0, arr.length-1));
    }

    static int search(int[] arr, int key, int st, int en){

        if(st>en){
            return -1;
        }

        int mid = st + (en-st)/2;
        
        if(arr[mid]==key){
            return  mid;
        }

        else if(key<arr[mid]){
            return search(arr, key, st, mid-1);     // Return is must, if we can't return it fun will not be ended 
        }

        return search(arr, key, mid+1, en);
        
    }
}
