package com.sorting;

import java.util.Arrays;

public class Selection_sort_M2 {
    
    public static void main(String[] args){
        int[] arr = {3,1,5,4,2};

        selectionSort(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr){

        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        
    }

    static int getMaxIndex(int[] arr, int st, int last) {
        int max = st;
        for(int i=0; i<=last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;

    }
}
