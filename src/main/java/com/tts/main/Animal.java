package com.tts.main;

public class Animal implements Eatable {

    @Override
    public void doEat() {
        System.out.println("This animal is eating.");
    }
}
