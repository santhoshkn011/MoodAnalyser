package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
//    @Test
//    public void givenMessage_WhenProper_ShouldReturnSad(){
//        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I Am In Sad mood.");
//        String result = moodAnalyser.analyseMood();
//        System.out.println(result);
//        Assertions.assertEquals("SAD" , result);
//    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("I Am In a Happy mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        Assertions.assertEquals("HAPPY" , result);
    }
}
