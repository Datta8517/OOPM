package com.P1;

import java.io.Console;
import java.util.Scanner;

public class ATM_Machine {

    //main method starts   
    public static void main(String args[] )  
    {  
        String Username, Pin = "";
        char[] Pass = new char[4];
        Scanner s = new Scanner(System.in);
        Console cons;

        System.out.print("Enter Username:");//Username:user
        Username = s.nextLine();
        if((cons = System.console()) != null){
            Pass = cons.readPassword("Input your 4 digit Pin"); //password:user
        }

        for(int i=0; i<Pass.length; i++){
            Pin = Pin+ Pass[i];
        }

        System.out.println(Pin);

        if(Username.equals("omkar") && Pin.equals("1234"))
        {
            call();
        }
        else if(Username.equals("Datta") && Pin.equals("4104"))
        {
            call();
        }
        else if(Username.equals("Sonali") && Pin.equals("1028"))
        {
           call();
        }
        else
        {
            System.out.println("login Failed, Username or Pin may be wrong");
        }
    }

    static void call(){
        System.out.println("login Successful");

        //declare and initialize balance, withdraw, and deposit
        int balance = 0, withdraw, deposit;

        //create scanner class object to get choice of user
        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.println("ATM Machine\n");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT\n");
            System.out.print("Choose the operation:");

            //get choice from user
            int choice = in.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    //get the withdrawl money from user
                    withdraw = in.nextInt();

                    //check whether the balance is greater than or equal to the withdrawal amount
                    if(balance >= withdraw)
                    {
                        //remove the withdrawl amount from the total balance
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        //show custom error message
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    //get deposite amount from te user
                    deposit = in.nextInt();

                    //add the deposit amount to the total balanace
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    //displaying the total balance of the user
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    //exit from the menu
                    System.exit(0);
            }

        }
    }
    
}
