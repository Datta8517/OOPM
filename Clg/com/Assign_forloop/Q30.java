package com.Assign_forloop;

import java.util.Scanner;

public class Q30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        if(arr[0]==arr[1] && arr[1]==arr[2]){
            System.out.println("All the numbers are equal");
        }
        else if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2]){
            System.out.println("All three numbers are different");
        }
        else{
            System.out.println("Neither all equal or different");
        }
    }
}
