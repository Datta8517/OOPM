package com.Basics;

import java.util.Scanner;

public class Sentence_print {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);   // System.in >> it means keyboard input
//        System.out.println(input.nextInt());
//        System.out.println(input.next());
        String name = input.nextLine();
        System.out.println(name);
    }
}
