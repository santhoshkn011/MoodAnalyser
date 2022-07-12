/*
Given “I am in Any Mood” message Should Return HAPPY
 */
package com.moodanalyser;

public class MoodAnalyserMain {
    public String analyseMood(String message){
        if (message.contains("Sad"))
            return "Sad";
        else if (message.contains("Happy"))
            return "Happy";
        else
            return null;
    }
}
