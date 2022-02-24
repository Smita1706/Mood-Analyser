package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	private String message;
	MoodAnalyzer(){
	}
	
	MoodAnalyzer(String message){
		this.message = message;
	}
	
	public String analyseMood() {
		if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
