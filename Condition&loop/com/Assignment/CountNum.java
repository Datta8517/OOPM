package com.Assignment;

public class CountNum {
    public static void main(String[] args) {
        int n= 4727735;
        int count = 0;

        while(n>0){
            int rem = n%10;

            if(rem == 7)
                count++;

            n/=10;
        }

        System.out.println(count);
    }
}
