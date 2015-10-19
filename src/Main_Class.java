import java.util.Scanner;

/*
Program: Quiz Test AND Rolling Dice Game 
Description: This Project contains two separate programs.
One is a quiz test and other is a rolling dice game.
Name: Able Varghese
Student No: 300 806 936
*/

public class Main_Class {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Object is created for the Test class
		Test Obj1 = new Test();

		
int input;

do{
System.out.println("Press 1 to take the quiz test \nPress 2 to play the Dice game\n"
		+ "Press 3 to exit\n");		
Scanner obj = new Scanner(System.in);
input = obj.nextInt();


switch(input)
{ 
case 1: Obj1.simulateQuestion();

case 2:
	//Object is created for the Dice class
	Dice Obj2 = new Dice();
	
case 3:	return;

default: System.out.println("Wrong input, try again!\n\n");		
	}
}
while(input!=3);


	}
	

}
