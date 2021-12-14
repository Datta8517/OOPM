package com;

import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        int ans = gcd(a, b);
        System.out.println(ans);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else
            return gcd(b, a % b);
    }
}
    // (a>b) then gcd = (b, a%b) = (a%b, b%(a%b)) and so on...  till b!=0
