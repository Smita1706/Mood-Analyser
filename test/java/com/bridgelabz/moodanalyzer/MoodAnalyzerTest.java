package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	 @Test
	    public void givenNullMood_ShouldThrowException() {
	        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
	        String mood =moodAnalyser.analyseMood(null);
	        Assert.assertEquals("HAPPY",mood);
	    }
}
