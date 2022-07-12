package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String result = moodAnalyser.analyseMood("I am In Sad mood.");
        System.out.println(result);
        Assertions.assertEquals("Sad" , result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
        String result = moodAnalyser.analyseMood("I am in a Happy Mood");
        System.out.println(result);
        Assertions.assertEquals("Happy" , result);
    }
}
