package com.BinarySearch;

import java.util.Scanner;

public class Root {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = square_root(n);
        System.out.println(ans);
    }

    static int square_root(int n){
        
        if(n==0 || n==1){
            return n;
        }
        int st =1, en =n;
        int ans =0;
        while(st<=en){
            int mid = st + (en-st)/2;
            if(mid == mid/n){
                return mid;
            }
            else if(mid > n/mid){
                en = mid-1;
                
            }
            else{
                st = mid+1;
                
            }
        }

        return en;
    }
}
