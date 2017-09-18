package princetonExamples;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Let's play a number-guessing game.");
		System.out.println("I'm thinking of a number between 1 and 100.");
		System.out.println("What's your guess?");

		Random random = new Random();
		int numberToGuess = random.nextInt(100);
		int userGuess = 0;
		int guesses = 0;

		while (userGuess != numberToGuess) {
			userGuess = sc.nextInt();
			guesses++;
			if (userGuess > numberToGuess)
				System.out.println("Too high. Try again!");
			else if(userGuess < numberToGuess)
				System.out.println("Too low. Try again!");
			else
				System.out.println("Congratulations! You guessed the number. It was " + numberToGuess);
		}
		sc.close();
		
		System.out.println("Number of attempts: " + guesses);
	}
}
