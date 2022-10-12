package ValidatePin;

import java.util.Scanner;

public class ValidatePin {

	public static void main(String[] args) {
		int validPin = 1234;

		Scanner declare = new Scanner(System.in);

		System.out.println("Please guess the PIN");
		int guessedPin = declare.nextInt();
		while (guessedPin != validPin) {
			System.out.println("Please guess the PIN");
			guessedPin = declare.nextInt();
		}
		System.out.println("Welcome!");
	}

}
