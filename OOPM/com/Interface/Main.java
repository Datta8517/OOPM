package com.Interface;

public class Main{

    public static void main(String[] args) {
        Car car = new Car();

        car.acc();
        car.brake();
        car.start();
        car.stop();

        Modified_Car car2 = new Modified_Car();
        car2.startMusic();
        car2.stopMusic();
        car2.start();
        car2.stop();
        Engine s = new Cng_Engine();
        car2.upgrade(s);

        car2.start();
    }
}
