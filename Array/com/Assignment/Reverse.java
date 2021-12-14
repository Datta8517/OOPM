package com.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    static void swap (int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse (int[] arr){
        int st = 0;
        int en = arr.length-1;
        while(st<en){
            swap(arr,st, en);
            st++;
            en--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[6];
        for(int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
}
