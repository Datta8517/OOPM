package com.Basics;

import java.util.Scanner;

public class LinearNumSearch {

    static int linearsearch(int[] arr, int target){
        for(int index = 0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of element");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of arr");
        for(int i =0; i<n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter element to find: ");
        int target = in.nextInt();

        System.out.println(linearsearch(arr, target));
    }
}
