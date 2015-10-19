
/*
Program: Rolling Dice Game
Program Description: The user picks a number between 2-12. Two dice are rolled together after that,
 and if the number picked by the user exists when the numbers are summed, then the user wins or the computer wins.
Name: Able Varghese
Student No: 300 806 936
 */

import java.util.Random;
import java.util.Scanner;

public class Dice {
	int choice;
	int dice;

	// Constructor where the user is asked to enter his/her choice of the number
	// between 2-12.
	// Results are stored from this same method.

	public Dice() {
		System.out.println("Please enter a number bwtween 2 - 12: ");
		Scanner user_input = new Scanner(System.in);
		this.choice = user_input.nextInt();
		output();
		
	}

	// Method in which the dice are rolled and winning or loosing decision is
	// determined
	public int rollDice() {

		int counter = 0;
		Random ranObj = new Random();

		for (int i = 0; i < 3; i++) {
			int Dice1 = 1 + ranObj.nextInt(6);
			int Dice2 = 1 + ranObj.nextInt(6);

			this.dice = Dice1 + Dice2;

			if (this.dice == this.choice)
				counter = counter + 1;
		}
		return (counter);

	}

	// Method in which results are printed to the screen
	public void output() {

		int counter = rollDice();
		System.out.println("Please wait 4 seconds. Dices are Rolling!.......\n");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();

		}

		if (counter > 0)
			System.out.println("Yes the number exists, You won!. \n\n");
		else
			System.out.println("Oops! Not this time. Computer Wins. please try again! \n\n");
		
		Main_Class.main(null);
	}

	
}
