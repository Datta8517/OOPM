package com.LeetCode;

import java.util.List;
import java.util.Scanner;

public class LuckyNumInMartix {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int[][] a1 = new int[i][j];

        for(int k=0; k<a1.length; k++){
            for(int l=0; l <a1[i].length; l++){
                a1[i][j] = in.nextInt();
            }
        }
    }
    
    static List<Integer> luckyNumbers (int[][] matrix){

        int[] arr = new int[matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){

            }
        }
        return null;
    }

}
