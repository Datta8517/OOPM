package com.LeetCode;

import java.util.Arrays;

public class FlippingAn_Image {
    public static void main(String[] args){
        int[][] arr = {{1,1,0}, {0,0,1}, {0,1,1}};
        int[][] narr=flipAndInvertImage(arr);
//        System.out.println(Arrays.toString(narr));
        for(int i=0; i<arr.length; i++){
                System.out.println(Arrays.toString(arr[i]));
        }
//        flipAndInvertImage(arr);
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length-1-j];
                image[i][image[i].length-1-j] = temp;
            }
        }
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                image[i][j] ^=1 ;
            }
        }

        return image;
    }
}
