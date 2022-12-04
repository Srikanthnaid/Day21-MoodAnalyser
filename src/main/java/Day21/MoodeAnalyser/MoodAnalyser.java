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

	// Function to Check Mood of a String Entered
	public String moodCheck() {
		
		// Created Try and Catch Blocks to Handle Exceptions if Occurs.
		try {
			if (message.contains("Sad")) {
				System.out.println("In SAD Mood");
				return "SAD";
			} else {
				System.out.println("In HAPPY Mood");
				return "HAPPY";
			}
		}
		// Don't Know what would be exception, So Took a Normal Exception to Catch,
		// Whatever Exception Occurs.
		catch (Exception exception) {
			return "HAPPY";
		}
	}
}
