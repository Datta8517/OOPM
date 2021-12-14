package com.Interface;

public class CD_player implements Media{
    @Override
    public void start() {
        System.out.println("Lets start Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Music Player");
    }
}
