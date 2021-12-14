package com.staticExample;

public class
Stat_initialize {
    static int a =5;
    static int b;

    static {
        System.out.println("I'm run here in static function");
        b = a*3;
    }

    public static void main(String[] args) {
        // To change in static no need to create an object bcoz static stuffs are object independent

//        Stat_initialize obj = new Stat_initialize();
        System.out.println(Stat_initialize.a + " " + Stat_initialize.b);

//        Stat_initialize obj2 = new Stat_initialize();
        b +=4;
        System.out.println(Stat_initialize.a + " " + Stat_initialize.b);
    }
}
