package com.sorting;

import java.util.Arrays;

public class Cyclic_Sort {

    public static void main(String[] args){
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // for cyclic sort, element of arr should be from 1 to N;
    static void sort (int[] arr){
        int i=0;
        
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!= arr[correct]){  //arr[i] should be == arr[arr[i] - 1]; if not then swap of element of the i(th) pos to the
                                        // pos of (i)th elem -1; 
                swap(arr, i , correct);
            }
            else{               // If element is on their correct pos than move i to forward
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    
}
