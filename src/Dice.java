import java.util.Random;
import java.util.Scanner;

public class Dice {
	int choice;
	int dice;

	public Dice() {
		System.out.println("Please enter a number bwtween 1 - 6: ");
		Scanner user_input = new Scanner(System.in);
		this.choice = user_input.nextInt();
		output();
	}

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

	public void output() {

		int counter = rollDice();
		if (counter > 0)
			System.out.println("Yes the number exsists,  time. You won!. ");
		else
			System.out.println("Oops! Not this time, please try again! ");
	}

}
