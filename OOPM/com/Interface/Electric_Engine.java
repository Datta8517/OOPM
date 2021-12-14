package com.Interface;

public class Electric_Engine implements Engine{
    @Override
    public void start() {
        System.out.println("I start the Electric engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop the Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate the Electric Engine");
    }
}
