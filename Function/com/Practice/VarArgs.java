package com.Practice;
// Variable arguments
/*If we don't know how many int/char/string want to pass in fun then simply use ...(variable name)*/

import java.util.Arrays;

public class VarArgs {

    static void num(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void name(String ...v){
        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args) {
//        num(23, 20, 11, 33, 45, 4, 7, 54);
        name("Dattatray" , "Pawan", "Naushad");
    }
}
