package Day21.ModeAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Day21.MoodeAnalyser.MoodAnalyser;

public class MoodAnalyserTest {
	 
	@Test
	public void givenMessage_ContainsHappy_returnTrue() {
		
		MoodAnalyser analyser = new MoodAnalyser();
		String msg = analyser.moodAnalyser("This is a happy msg");
		Assertions.assertEquals("happy", msg);
	}
	
	@Test
	public void givenMessage_ContainsSAD_ReturnTrue() {
		
		MoodAnalyser analyser = new MoodAnalyser();
		String msg = analyser.moodAnalyser("This is a sad msg");
		Assertions.assertEquals("sad", msg);
	}
}
