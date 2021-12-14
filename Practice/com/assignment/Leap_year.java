package com.assignment;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args){
        System.out.println("Enter year to check it is leap or not: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        // year to be checked
        boolean leap = false;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
