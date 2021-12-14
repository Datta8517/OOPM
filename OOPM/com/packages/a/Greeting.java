package com.packages.a;

import static com.packages.a.Sample.fun;

public class Greeting {

    public static void main(String[] args) {
        fun();      //  if called function is in same package then not necessary to make it public but to access it in other package then need to make it public
        Sample.message();  // this is another way to access method from same package
    }
}
