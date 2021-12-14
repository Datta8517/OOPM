package com.Basics;

import java.util.Scanner;

public class OrderAccousticBS {

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
        System.out.println(OrderAccousticBS(arr, target));

    }

    static int OrderAccousticBS(int[] arr, int target){

        int st = 0;
        int en = arr.length -1;

        boolean isAsc;
        if(arr[st]< arr[en]){
            isAsc = true;
        }
        else{
           isAsc = false;
        }
        while(st<=en){
            int mid=  st + (en-st)/2;
            if(target == arr[mid]){
                return mid;
            }
            if (isAsc == true){
                if(target>arr[mid]){
                    st = mid+1;
                }
                else if(target< arr[mid]){
                    en = mid -1;
                }
            }
            else{
                if(target < arr[mid]){
                    st = mid+1;
                }
                else if(target > arr[mid]){
                    en = mid -1;
                }
            }

        }
        return -1;
    }
}
