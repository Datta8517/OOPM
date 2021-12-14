package com.Basics;

import java.util.Scanner;

// Array should be sorted
public class BinarySearch {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Size of the arr: ");
        int n = in.nextInt();

        System.out.println("Enter the element of the arr: ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = in.nextInt();

        System.out.println("Index of the target element is: ");
        System.out.println(binarySearch(arr,  target));

    }

    static int binarySearch(int[] arr, int target){

        int st = 0;
        int en = arr.length -1;
        while(st<=en){
            int mid=  st + (en-st)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                st = mid+1;
            }
            else if(target< arr[mid]){
                en = mid -1;
            }
        }
        return -1;
    }

}
