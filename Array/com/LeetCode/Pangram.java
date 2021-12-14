package com.LeetCode;

public class Pangram {
    public static void main(String[] args){


    }

    static boolean pangramCheck(String sentance){

        if(sentance.length()<26){
            return false;
        }

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<alpha.length(); i++){
            if(sentance.indexOf(alpha.charAt(i))==-1){
                return false;
            }
        }

        return true;
    } 
    
}
