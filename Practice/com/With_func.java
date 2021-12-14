package com;
import java.util.*;

class emp1 {
    int a=8;
    int b= 7;
    int c;

    int add(int a,int b)
    {
        return a+b;
    }

}
public class With_func extends emp1 {

    int d,e,f;
    public static void main(String[] args)
    {
        With_func A=new With_func();

        //A.d=A.add(3,5);

        System.out.println(A.add(3,5));
    }
}
