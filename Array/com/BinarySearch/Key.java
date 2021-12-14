package com.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Key {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(checkKey(arr,key)));
//        checkKey(arr, key);

    }

    static int[] checkKey(int[] numbers, int target){
        int st = 0;
        int en = numbers.length-1;
        int[] ans = {-1,-1};
        while(st<en){
            int mid = st + (en-st)/2;

            if((numbers[st]+ numbers[en])==target){
                ans[0]=st+1; ans[1] =en+1;
                return ans;
            }
            else if((numbers[st]+ numbers[en])> target){
                en--;
            }
            else{
                st++;
            }
        }

        return ans;
    }
}
