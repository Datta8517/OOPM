package com;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int c=0;    // for neg count;
        int p =0;   // for pos count;
        int z =0;  // for zero count
        char ch = 'y';

        do{
            int n = sc.nextInt();
            if(n>0)
                p++;
            else if(n<0){
                c++;
            }
            else if(n==0)
                z++;

            System.out.println("do you want to continue to add num? (y/n)");
            ch = sc.next().charAt(0);
        }
        while(ch =='y' || ch=='Y');

        System.out.println("pos count " + p + " neg count " + c + " zero count " + z );
    }
}
