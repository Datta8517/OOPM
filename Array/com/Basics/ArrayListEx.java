package com.Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>(10);

//        num.add(20);
//        num.add(10);
//        num.add(40);
//        num.add(30);
//        num.add(34);
//        num.add(76);
//        num.add(204);
//        num.add(234);
//        num.add(88);
//
       boolean a = num.contains(40);
       System.out.println(a);
//
//        System.out.println(num);
//
//        num.set(2, 07);
//        System.out.println(num);
//
//        num.remove(7);
//        System.out.println(num);


        // Input
        for(int i=0; i<5; i++){
            num.add(in.nextInt());
        }

        //Output
        for(int i=0; i<5; i++){
            System.out.println(num.get(i)+ " ");
        }

        System.out.println(num);

    }
}
