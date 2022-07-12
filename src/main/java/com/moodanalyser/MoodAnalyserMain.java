/*
Refactor the code to take the mood message in Constructor
 */
package com.moodanalyser;

public class MoodAnalyserMain {
    public static String message;
    //constructor
    public MoodAnalyserMain(String message){
        this.message = message;
        analyseMood();
    }
    public String analyseMood(){
        if (message.contains("Sad"))
            return "SAD";
        else if (message.contains("Happy"))
            return "HAPPY";
        else
            return "HAPPY";

    }
}
