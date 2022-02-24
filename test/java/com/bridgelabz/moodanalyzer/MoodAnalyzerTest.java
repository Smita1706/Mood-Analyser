package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	 @Test
	    public void givenMessage_WhenSad_ShouldReturnSad() {
	        MoodAnalyzer MoodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
	        String mood = null;
	        try {
	            mood = MoodAnalyzer.analyseMood();
	        } catch (MoodAnalysisException e) {
	            e.printStackTrace();
	        }
	        Assert.assertEquals("SAD", mood);
	    }

	    @Test
	    public void givenMessage_WhenHappy_ShouldReturnHappy() {
	        MoodAnalyzer MoodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
	        String mood = null;
	        try {
	            mood = MoodAnalyzer.analyseMood();
	        } catch (MoodAnalysisException e) {
	            e.printStackTrace();
	        }
	        Assert.assertEquals("HAPPY", mood);
	    }

	    @Test
	    public void givenNullMood_ShouldReturnHappy() {
	        MoodAnalyzer MoodAnalyzer = new MoodAnalyzer(null);
	        String mood = null;
	        try {
	            mood = MoodAnalyzer.analyseMood();
	           
	            
	        } catch (MoodAnalysisException e) {
	            e.printStackTrace();
	        }
	        System.out.println(mood);
	        Assert.assertEquals("HAPPY", mood);
	    }

	    @Test
	    public void givenEmptyMood_ShouldThrowException_withType() {
	        MoodAnalyzer realMoodAnalyzer = new MoodAnalyzer("");
	        try {
	            realMoodAnalyzer.analyseMood();
	        } catch (MoodAnalysisException e) {
	            e.printStackTrace();
	            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
	        }
	    }

	    @Test
	    public void givenNullMood_ShouldThrowException_withType() {
	        MoodAnalyzer realMoodAnalyzer = new MoodAnalyzer(null);
	        try {
	            realMoodAnalyzer.analyseMood();
	        } catch (MoodAnalysisException e) {
	            e.printStackTrace();
	            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
	        }
	    }
}
