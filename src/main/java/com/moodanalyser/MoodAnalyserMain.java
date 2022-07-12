/*
GGiven “I am in Sad Mood” message Should Return SAD
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
