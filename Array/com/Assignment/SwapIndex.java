package com.Assignment;

import com.Basics.Array;

import java.util.Arrays;

public class SwapIndex {

    static void swap(int [] arr, int a, int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 23, 9, 7};
//        int[] nums = new int[6];

        System.out.println("Array before change " + Arrays.toString(arr));
        swap(arr, 1, 4);
        System.out.println("Array after change " + Arrays.toString(arr));
    }
}
