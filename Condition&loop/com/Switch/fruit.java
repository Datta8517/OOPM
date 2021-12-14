package com.Switch;

import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        // By Enhance method
        switch (fruit) {
            case "Mango" -> System.out.println("King of the mango");
            case "Apple" -> System.out.println("Red sweet fruit");
            case "Orange" -> System.out.println("Citric acid fruit");
            case "Graphs" -> System.out.println("Mostly use in beverage");
            default -> System.out.println("Enter fruit name mention in menu: ");
        }

        // By Old method
//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of the mango");
//                break;
//            case "Apple":
//                System.out.println("Red sweet fruit");
//                break;
//            case "Orange":
//                System.out.println("Citric acid fruit");
//                break;
//            case "Graphs":
//                System.out.println("Mostly use in beverage");
//                break;
//            default:
//                System.out.println("Enter fruit name mention in menu: ");
//                break;
//        }
    }
}
