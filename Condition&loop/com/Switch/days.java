package com.Switch;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day = input.nextInt();

//        switch(day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//
//            case 6:
//            case 7:
//                System.out.println("Weekend day");
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend day");
        }
    }
}
