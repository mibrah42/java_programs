import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		int secretNumber = (int)(Math.random() * 100) + 1;
		// System.out.println("secret number is " + secretNumber);
		int tries = 0;
		int guess;

		Scanner in = new Scanner(System.in);

		do {
			System.out.print("Enter a guess between 1 - 100: ");
			guess = in.nextInt();
			++tries;

			if(guess > secretNumber)
				System.out.println("Your guess is too high, try again");
			else if (guess < secretNumber)
				System.out.println("Your guess is too low, try again");
			else 
				System.out.println("Thats it!!! you got it");

		} while(guess != secretNumber);

		System.out.println("You figured it out in " + tries + " tries!");

	}
}