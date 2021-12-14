package com.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {

    static int[] index(int[][] Arr, int target){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(Arr[i][j] == target){
                    return new int []{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] Arr = new int[3][3];

        System.out.println("Enter elements of 2D array: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                Arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter target: ");
        int target = in.nextInt();
        int[] ans = index(Arr, target);
        System.out.println(Arrays.toString(ans));

    }
}
