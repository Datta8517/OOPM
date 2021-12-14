package com.Asignment;

import java.util.Scanner;

public class MaxMin {

    // static int mx(int a, int b, int c){
    //     int max = a;
    //     if(b>max){
    //         max = b;
    //     }
    //     if(c>max){
    //         c = max;
    //     }
    //     return max;
    // }

    // static void mn(int t){
    //     Scanner in = new Scanner(System.in);
        
    // }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // System.out.print("Enter three num: ");
        int t = in.nextInt();
        while(t>0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            int min=a;
            if(b<min){
                min = b;
            }
            if(c<min){
                min = c;
            }
           

            if(min==a){
                System.out.println("Draw");
                // break;
            }
            else if(min==b){
                System.out.println("Bob");
                // break;
            }
            else{
                System.out.println("Alice");
                // break;
            }
            t--;
        }

        // int ans = mx(a, b, c);
        // System.out.println("Max num is: " + ans);

        // mn(t);
       

    }
}
