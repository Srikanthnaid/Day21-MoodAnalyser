package Day21.ModeAnalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Day21.MoodeAnalyser.MoodAnalyser;

public class MoodAnalyserTest {

	// Refactor TC 1.1
	@Test
	public void if_MessageWasSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyze = new MoodAnalyser("I am in Sad Mood");

		String result1 = moodAnalyze.moodCheck();
		Assertions.assertEquals("SAD", result1);
	}

	// Refactor TC 1.2
	@Test
	public void if_MessageWasHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyze = new MoodAnalyser("I am in Happy Mood");

		String result2 = moodAnalyze.moodCheck();
		Assertions.assertEquals("HAPPY", result2);
	}
}
