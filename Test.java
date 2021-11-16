import java.util.Random;
import java.util.Scanner;
import java.util.*;

// Setting Up//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Test {

	public static void main(String[] args) {

	String [][] allCapitals = StateCapitals.getCapitals();

	String [] Ranstate = new String [1];

	String [] quizanswers = new String [10];

	boolean [] correctness = new boolean [10];

	boolean token;

	int correct = 0;

	int False = 0;

	String ch1 = "b";

	String ch2 = "e";

//Program Start Output and Initial User Input\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

		System.out.println("Hello! Welcome to Joshua Pipkins's State Capital Quiz! ");

		System.out.println("In this program we'll ask you to find the capitals of ten different random states! ");

		System.out.println("Do you think you can answer them all correctly? ");

		System.out.println("If you're ready to begin type Begin, if you want to end the program type Exit. ");

		Scanner newScan = new Scanner(System.in);

		String userinput = newScan.nextLine();

//Switch statement and Cases///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


switch(userinput){

	case "begin":

	case "Begin":

		   for (int i = 0; i < quizanswers.length; i++){

// Find a random state in the array
			Random rand = new Random();
			int idx = rand.nextInt(50);
			Ranstate = allCapitals[idx]; // Get a random array
			String state = Ranstate[0]; // Get the state from the random array
			String city = Ranstate[1]; // Get the city from the random array
// Ask the user about the input for the state
			System.out.print("What is the capital of "+state+"? ");
			state = quizanswers[i];
// Record the input
			quizanswers[i] = newScan.nextLine();
// Check the input is correct for the state
// Note: String comparison requires the .equals() method for Java
			if (quizanswers[i].equals(city)) {
				correctness[i] = true; // Set this answer to true in our correctness array
				System.out.println(quizanswers[i] + " is Correct");
				correct++; }
			else {
				correctness[i] = false; // Set this answer to false in our correctness array
				System.out.println(quizanswers[i] + " is False");
				False++;}
		     }



			for (int i = 0; i < quizanswers.length; i++) {


// Check if this answer was correct
			if (correctness[i]){
// To Do: Track how many are correct
				System.out.println("Answer " + i + ": " + quizanswers[i] + " was Correct"); }
			else {
				System.out.println(quizanswers[i] + " was False");}

		}


				System.out.println("Correct Answers: " + correct);
				System.out.println("Incorrect Answers: " + False);

// Display the number correct after the loop is done
				break;

	case "exit":
	case "Exit":
				System.out.println("See you next time!");
				System.exit(0);


		}
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
