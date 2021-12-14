package com.Interface;

public class Cng_Engine implements Engine{
    @Override
    public void start() {
        System.out.println("I start cng engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop cng engine");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate the cng engine");
    }
}
