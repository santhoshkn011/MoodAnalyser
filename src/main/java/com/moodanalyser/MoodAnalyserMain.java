/*
Given Null Mood Should Return Happy

To make this Test Case pass Handle NULL Scenario using try catch and return Happy
 */

package com.moodanalyser;

public class MoodAnalyserMain {
    public static String message;

    public MoodAnalyserMain(String message) {
        this.message = message;
        analyseMood();
    }

    public String analyseMood() {
        try{
            if (message.contains("Sad"))
                return "SAD";
            else if (message.contains("Happy"))
                return "HAPPY";
//            else
//                return "HAPPY";

        }catch (NullPointerException e){
            System.out.println("Please Enter the Valid Mood.");
        }
        return "HAPPY";
    }
}

