package com;

public class sqrt_Root {
    public static void main(String[] args){
        int decimal = 3;
        int n = 40;
        System.out.printf("%.3f",sqrt(n, decimal));
    }

    static double sqrt(int n, int decimal){
        int st =0;
        int en = n;
        double root = 0.0;

        while(st<=en){
            int mid = st + (en-st)/2;

            if(mid*mid==n){
                return mid;
            }
            if(mid*mid <n){
                st= mid+1;
                root = mid;
            }
            else{
                en = mid-1;

            }

        }
        double point = 0.1;
        for(int i=0; i<decimal; i++){
            while(root*root<=n){
                root+=point;
            }
            root-=point;
            point/=10;
        }

        return root;
    }
}
