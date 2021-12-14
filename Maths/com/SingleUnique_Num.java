package com;

public class SingleUnique_Num {

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 3, 2, 1, 6, 4, 1};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        // As we simply add all the +ve and -ve no. to access the single non-negative no.
        // Similarly we XOR the number with 0 to get the non-duplicate no.

        int unique = 0;
        for (int i = 0; i < arr.length; i++){
                unique^=arr[i];
        }

        return unique;
    }

}