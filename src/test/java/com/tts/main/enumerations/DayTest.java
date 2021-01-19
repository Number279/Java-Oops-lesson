package com.tts.main.enumerations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    public static void checkDay(Day day){
        switch (day) {
            case MONDAY -> System.out.println("Mondays suck.");
            case FRIDAY -> System.out.println("Fridays are better.");
            case SATURDAY,SUNDAY -> System.out.println("Weekends are best.");
            default -> System.out.println("Midweeks are so-so.");
        }
    }

    @Test
    void test() {
        checkDay(Day.MONDAY);
    }
}