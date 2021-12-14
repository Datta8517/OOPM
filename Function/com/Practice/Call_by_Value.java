package com.Practice;

public class Call_by_Value {

    static int sum(int a, int b){
        int total = a +b;              // This change will valid only in this fun

        return total;
    }

    static String name(String Name){

        String Sr = "Jamkhande";
        String ans = Sr + " " + Name; // This change will valid only in this fun

        // Thi

        return ans;
    }

    // If we make arr fun and change the value of arr[0] it will reflect in main fun as well

    public static void main(String[] args) {
//        int q = 32;
//        int s = 5;
//        int ans = sum(q,s);
//        System.out.println(ans);

        String Name = "Dattaray";
        System.out.println(name(Name));
    }


}
