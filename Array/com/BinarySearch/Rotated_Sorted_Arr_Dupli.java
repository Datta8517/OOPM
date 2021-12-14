package com.BinarySearch;

public class Rotated_Sorted_Arr_Dupli {

    public static void main(String[] args) {
        int[] arr = {2,3,3,3,5,6,0,0,1,2};
        int target = 3;

        System.out.println(Bs_dupli_ele(arr, target));
    }

    static boolean Bs_dupli_ele(int[] arr, int target){
        int st = 0;
        int en = arr.length-1;
        int n = arr.length;

        while(st<=en){
            int m = st + (en-st)/2;
            if(arr[m]==target){
                return true;
            }
            while(st<m && arr[st] == arr[m]){
                st+=1;
            }
            while(m<en && arr[en]==arr[m]){
                en-=1;
            }
            if(arr[st]<= arr[m]){

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
        return false;
    }
}
