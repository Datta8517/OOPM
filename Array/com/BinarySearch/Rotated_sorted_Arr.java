package com.BinarySearch;

public class Rotated_sorted_Arr {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int key = 6;

        System.out.println(check(arr, key));
    }

    static int check(int[] arr, int target){
        int st = 0;
        int en = arr.length-1;

        while(st<=en){
            int m = st + (en-st)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[st]<= arr[m]){

                if(target >= arr[st]  && target < arr[m]){
                    en = m-1;
                }
                else{
                    st = m+1;
                }
            }
            else if(arr[en]>=arr[m]){
                if(target> arr[m] && target<=arr[en]){
                    st = m+1;
                }
                else
                    en = m-1;
            }
        }
        return -1;
    }
}
