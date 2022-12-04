package Day21.MoodeAnalyser;

public class MoodAnalyser {
	
	// Given a Message, ability to analyse and respond Happy or Sad Mood.
	public String moodAnalyser(String message) {
		
		if(message.contains("happy")) {
			return "happy";
		}else {
			return "sad";
		}
	}

}
