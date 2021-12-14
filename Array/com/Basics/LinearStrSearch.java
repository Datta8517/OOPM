package com.Basics;

public class LinearStrSearch {

    static boolean SearchName(String name, char target){
        for(int i=0; i<name.length(); i++){
            if(target== name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Dattatray";
        char target = 'y';


        System.out.println(SearchName(name, target));
    }
}
