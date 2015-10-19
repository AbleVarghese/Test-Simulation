import java.util.Random;
import java.util.Scanner;

public class Test {

	// Instance Variables
	private int choice;
	private int actualAnswer1 = 2;
	private int actualAnswer2 = 1;
	private int actualAnswer3 = 2;
	private int actualAnswer4 = 1;
	private int actualAnswer5 = 3;
	private int position;

	// Getters and Setters

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getActualAnswer1() {
		return actualAnswer1;
	}

	public int getActualAnswer2() {
		return actualAnswer2;
	}

	public int getActualAnswer3() {
		return actualAnswer3;
	}

	public int getActualAnswer4() {
		return actualAnswer4;
	}

	public int getActualAnswer5() {
		return actualAnswer5;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int answer) {
		this.choice = answer;
	}

	public Test() {
		// TODO Auto-generated constructor stub
	}

	Scanner user_input = new Scanner(System.in);

	public void simulateQuestion() {
		int choice;

		setPosition(1);
		System.out.println("Do contructors return a value? no");
		System.out.println("Choices:\n1. yes \n2. no \n3. 1 value \n4. 2 values");
		choice = user_input.nextInt();
		setChoice(choice);
		checkAnswer();

		setPosition(2);
		System.out.println("How many return a value(s) are possible from a method? 1");
		System.out.println("1. One \n2. Two \n3. None \n4. many");
		choice = user_input.nextInt();
		setChoice(choice);
		checkAnswer();

		setPosition(3);
		System.out.println("What is the default value of an instance variable of type double? 0.0 ");
		System.out.println("1. 0 \n2. 0.0 \n3. 1 \n4. null");
		choice = user_input.nextInt();
		setChoice(choice);
		checkAnswer();

		setPosition(4);
		System.out.println("How many values can a primitive type variable store at a time? 1");
		System.out.println("1. One \n2. 2 \n3. many value \n4. 300 values");
		choice = user_input.nextInt();
		setChoice(choice);
		checkAnswer();

		setPosition(5);
		System.out.println("The default value of an instance variable of type String is null ");
		System.out.println("1. one \n2. two \n3. null \n4. \"\" ");
		choice = user_input.nextInt();
		setChoice(choice);
		checkAnswer();
	}

	// Answer Check method

	public void checkAnswer() {

		switch (getPosition()) {
		case 1:
			if (getChoice() == getActualAnswer1()) {
				outputResults(1);

			} else {
				outputResults(2);
			}
			break;
		case 2:

			if (getChoice() == getActualAnswer2()) {
				outputResults(1);

			} else {
				outputResults(2);
			}
			break;

		case 3:

			if (getChoice() == getActualAnswer3()) {
				outputResults(1);

			} else {
				outputResults(2);
			}

			break;

		case 4:
			if (getChoice() == getActualAnswer4()) {
				outputResults(1);

			} else {
				outputResults(2);
			}

			break;

		case 5:
			if (getChoice() == getActualAnswer5()) {
				outputResults(1);

			} else {
				outputResults(2);
			}
			break;

		}

	}

	// Output method

	public void outputResults(int answer) {
		Random ranObj = new Random();
		int i, ran = 0;

		if (answer == 1)
			ran = 1 + ranObj.nextInt(3);
		else
			ran = 4 + ranObj.nextInt(3);

		switch (ran) {
		case 1:
			System.out.println("Good");
			break;
		case 2:
			System.out.println("Awesome");
			break;
		case 3:
			System.out.println("Correct");
			break;
		case 4:
			System.out.println("Incorrect");
			break;
		case 5:
			System.out.println("Oh ooo.. try again");
			break;
		case 6:
			System.out.println("Wrong this time");
			break;

		}

	}

}
