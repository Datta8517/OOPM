package com;

import java.util.Scanner;

// find ith bit of the number
public class I_Bit_OfBinaryNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 11010;
        int dupliA = a;
        int count = 0;
        while(dupliA!=0){
            count++;
            dupliA/=10;
        }
        System.out.println(count);
        int i = sc.nextInt();
        int ans = (a&(1<<(count-i)));
        System.out.println(ans);
    }
}
