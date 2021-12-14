package com.Assignment;

public class MaxValue {

    static int max(int[] arr){

        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxValue)
                maxValue = arr[i];
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {1,24,11,9,17,18};
        System.out.println(max(arr));
    }
}
