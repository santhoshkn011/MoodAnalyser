/*
Given a Message, ability to analyse and respond Happy or Sad Mood
- Continuation of Mood Analyser Problem in
Junit Intro
- Create MoodAnalyser Object
- Call analyseMood function with message as
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
