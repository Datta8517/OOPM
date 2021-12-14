package com.BinarySearch;

import java.util.Scanner;

public class Arranging_coins {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = coin(n);
        System.out.println(ans);
    }

    static int coin(int n){
        long  st =1;
        long en =n;

        while(st<=en){
            long mid = st + (en-st)/2;
            long curr = mid * (mid+1)/2;
            if(curr == n){
                return (int)mid;
            }
            else if(curr < n){
                st = mid+1;
            }
            else{
                en = mid-1;
            }
        }

        return (int)en;
    }
}
