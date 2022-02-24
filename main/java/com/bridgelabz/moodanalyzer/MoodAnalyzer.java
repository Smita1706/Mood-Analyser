package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	public String analyseMood(String message) {
		try {
            if (message.contains("sad")) {
                return "SAD";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
        return null;
    }

}
