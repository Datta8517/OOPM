package com;

import java.util.Scanner;

// if pos id
public class Set_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 1234;

        int dn = n;
        int x=1;
        long ans=0;

        while(x<=dn){
            x*=2;
        }
        x/=2;

        while(x>0){
            int lastdigit = dn/x;
            dn-=lastdigit*x;
            x/=2;
            ans= ans*10 +lastdigit;
        }

        System.out.println(ans);
        // set the ith bit in n;
        System.out.println("Enter which pos do u want to set");
        int i = sc.nextInt();
        int ans2 = ((1<<i)|n);
        System.out.println(ans2);
    }
}
