package com.Basics;

import java.util.Arrays;

public class Mutability {
//Arrays is mutable in fun that's why change in fun reflect in main also

    // String is immutable in fun hence change in fun can't reflect in main
    static void change(int[] arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int[] num = {12, 20, 33, 45, 54};
        System.out.println(Arrays.toString(num));

        change(num);
        System.out.println("after updating 0 index");
        System.out.println(Arrays.toString(num));

    }
}
