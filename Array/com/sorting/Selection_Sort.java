package com.sorting;

import java.util.Arrays;

public class Selection_Sort {

    public static void main(String[] args){
        int[] arr = {12,45,13,51,19,8};

        selectionSort(arr);
    }

    static void selectionSort(int[] arr){

        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
