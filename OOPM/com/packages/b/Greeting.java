package com.packages.b;

import com.packages.a.Sample;

import static com.packages.a.Sample.message;

public class Greeting {

    public static void main(String[] args) {
        message();      // we can access the message() method from another package due to its defined in public class
        //  fun();      //  fun() method in Sample class is in static, and it is in different folder, so we can't access it without doing fun() public


    }
}
