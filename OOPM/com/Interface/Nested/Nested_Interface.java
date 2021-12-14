package com.Interface.Nested;

public class Nested_Interface {

    // Nested interface, it can be default, private,  public , static but top level interface has to be declared as public or default
    public interface A{
        boolean isOdd(int num);
    }
}

class B implements Nested_Interface.A{

    @Override
    public boolean isOdd(int num) {
        return((num&1)==1);
    }
}

class Main extends B{
    public static void main(String[] args) {
        Main b = new Main();

        System.out.println(b.isOdd(4));
    }
}