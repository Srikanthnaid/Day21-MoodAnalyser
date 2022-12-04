package Day21.MoodeAnalyser;

public class MoodAnalyser {
	/*
	 * To Check the Mood of the Person by String Entered. Emphasis on - Junit Test
	 * Cases - Exception Handling - Custom Exceptions
	 */

	String message;

	// constructor
	public MoodAnalyser(String message) {

		this.message = message;
	}

	public MoodAnalyser() {
		// TODO Auto-generated constructor stub
	}

	// Function to Check Mood of a String Entered
	public String moodCheck() throws MoodAnalysisException {

		if (message == null) {
			throw new MoodAnalysisException(
					MoodAnalysisException.type_of_exception.NULL_MOOD_EXCEPTION + " Please enter valid message.");

		} else if (message.isEmpty()) {
			throw new MoodAnalysisException(
					MoodAnalysisException.type_of_exception.EMPTY_MOOD_EXCEPTION + " Please enter valid message.");

		} else if (message.contains("Sad")) {
			return "SAD";

		} else {
			return "HAPPY";
		}

	}
}
