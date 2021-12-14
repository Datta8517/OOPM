package com.Assign_forloop;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        if(arr[0]<arr[1] && arr[2]>arr[1]){
            System.out.println("Increasing Order");
        }
        else if(arr[0]>arr[1] && arr[1]> arr[2]){
            System.out.println("Decreasing Order");
        }
        else{
            System.out.println("Neither Increasing nor Decreasing");
        }
    }
}
