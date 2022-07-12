/*
Given “I am in Happy Mood” message in Constructor Should
Return SAD

Handle Exception if User Provides Invalid Mood
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
        return "";
    }
}

