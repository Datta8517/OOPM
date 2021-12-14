package com.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.info();
        System.out.println(box.weight);
        Box box1 = new Box(4,5,3);
        System.out.println(box1.l * box1.w * box1.h);

        Box box2 = new Box(box1);
        // Type of the reference determine that which member can be access not type of object
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        Boxweight bw1 = new Boxweight(3,5,2,64);
        System.out.println(bw1.l + " " + bw1.w + " " + bw1.h + " " + bw1.weight);

        Boxweight bw = new Boxweight();
        System.out.println(bw.l + " " + bw.weight);


        // if I write something like below ref= Box and object= Boxweight then while printing it only access the member of ref not an object
        Box box5 = new Boxweight(3,5,3,64);     // Boxweight has constructor namely super so we can initialize it


//        Boxweight bw5 = new Box(3,6,7);   // Box don't know about what is in th Boxweight, so we can't create like this
        // also Box has no any constructor to initialize the Boxweight member


        Boxweight bw7 = new Boxweight(3,5,4,2, 34);

    }
}
