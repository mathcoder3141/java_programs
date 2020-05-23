import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		System.out.println("Let's play rock, paper, scissors!");
		System.out.print("Choose your weapon -> Rock (1), Paper (2), Scissor (3): ");
		int user_choice;
		Scanner sc = new Scanner(System.in);
		user_choice = sc.nextInt();
		// user_choice = 1 Rock
		// user_choice = 2 Paper
		// user_choice = 3 Scissors
		Random rand = new Random();
		int computer_choice = rand.nextInt(3) + 1;
		if (computer_choice == 1) {
			System.out.println("The computer chose rock");
			if (user_choice == 1) {
				System.out.println("TIE");
			}
			else if (user_choice == 2) {
				System.out.println("YOU WIN");
				}
			else if (user_choice == 3) {
				System.out.println("YOU LOSE");
			}
		}
		if (computer_choice == 2) {
			System.out.println("The computer chose paper");
			if (user_choice == 1) {
				System.out.println("YOU LOSE");
			}
			else if (user_choice == 2) {
				System.out.println("TIE");
				}
			else if (user_choice == 3) {
				System.out.println("YOU WIN");
			}
		}
		if (computer_choice == 3) {
			System.out.println("The computer chose scissors");
			if (user_choice == 1) {
				System.out.println("YOU WIN");
			}
			else if (user_choice == 2) {
				System.out.println("YOU LOSE");
				}
			else if (user_choice == 3) {
				System.out.println("TIE");
			}
		}
		System.out.print("Want to play again? ");
		String response;
		Scanner ng = new Scanner(System.in);
		response = ng.next();
		if (response.equalsIgnoreCase("yes")) {
			main(null);
		}
		else
			System.out.println("Goodbye!");
	}
}