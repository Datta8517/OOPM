package com.Interface;

public class Modified_Car {
    private Engine engine;
    private Media Player = new CD_player();
    private Brake b = new Brke();

    public Modified_Car() {
        engine = new Electric_Engine();
    }

    public Modified_Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        Player.start();
    }

    public void stopMusic(){
        Player.stop();
    }


    public void b(){
        b.brake();
    }

    public void upgrade(Engine engine){
        this.engine = engine;

    }
}
