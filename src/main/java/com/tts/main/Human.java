package com.tts.main;

public class Human extends Animal implements Walkable, Communicatable{
    @Override
    public void doWalk() {
        System.out.println("This human is walking.");
    }

    @Override
    public void doCommunication() {
        System.out.println("This human spoke.");
    }
}
