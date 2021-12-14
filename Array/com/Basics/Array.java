package com.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the arr: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter element of the arr: ");
//        for(int i=0; i<n; i++){
//            arr [i] = in.nextInt();
//        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

//        System.out.println(Arrays.toString(arr));
    }
}
