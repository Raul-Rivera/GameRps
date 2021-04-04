/*
Name: Raul Rivera Ortiz
Course: CSC 122 001
Project #3
Project description:
	I made a game to allow a user to play Rock, Paper and Sissors against the Computer.
Purpose:
	1. Become familiar importing Scanner class for create a input.
	2. Become familiar with while loops.
	3. Become familiar with for loops.
	4. Become familiar with if, else if and else Statements.
	5. Entertain the user.
	
What the program does?:
	The program print: 
		Welcome to the Game.
		You are playing against the computer.
		Select rock 'r' paper 'p' or sissors 's'
	The program allows User to play the game multiple times and keeps track
	of the number of wins, losses and ties.
	
	
	NOTE: 
		If 
		
How you tested the program:
	First, 
	
	
	NOTE: 
		I 
		
Limitations if any in the program:
	No limitations.
*/

import java.util.*;
public class GameRps { //Open class GameRps.
	public static void main(String[] args) { //Start main method
		Scanner console = new Scanner(System.in);//Creates Scanner object for get inputs from the user.
		
		for(int i = 1; i<=5; i++) { //Let the User play 5 times.
			explain(); //Call the funcion explain.
			char choice = console.next().charAt(0); //Create variable 'choice' and assign the value of the input. 
			char comChoice = computer(); //Create variable 'comChoice' and assign the value of the computer selects.
				
			while(choice != 'r' && choice != 'p' && choice != 's') { //Allows the user to play only if he(she) choose the letters r, p or s
				System.out.println("Invalid choice."); //Print 'Invalid choice'
				System.out.println("Please enter: 'r', 'p' or 's'.\n"); //Print Please enter: 'r', 'p' or 's'.\n
				choice = console.next().charAt(0); //Assign the value of the input to the variable 'choice'.
			}
			System.out.println("Computer chose: "+comChoice); //Print Computer chose:(and the choice of the computer).
			System.out.println("User chose: "+choice); //Print User chose:(and the choice of the User). 
			declareWinner(choice, comChoice); //Call the funcion declareWinner.
			System.out.println(); //Create space between lines.
			
		} //Close for.
		
	}//Close main method.
	
public static void explain() { //Prompt with explanation of the Game.
	System.out.println("\nWelcome to the Game.");  //Print Welcome to the Game.
	System.out.println("You are playing against the computer."); //Print You are playing against the computer.
	System.out.println("Select rock 'r' paper 'p' or sissors 's'\n"); //Print Select rock 'r' paper 'p' or sissors 's'
}//Closes method explain.

public static char computer() { //Computer selects the move.
	Random move = new Random(); //Using Random class.
	int move1 = move.nextInt(3)+1; //Actual values with 1,2, or 3. 
	if (move1 == 1) //If the variable move1 is equal to 0+1
		return 'r'; //Print 'r'
	else if (move1 == 2) //Else if the variable move1 is equal to 1+1 
		return 'p'; //Print 'r'
	else return 's'; //Else the variable move1 is equal to 2+1, print 'r'  
}//close method computer 

public static void declareWinner(char user, char machine){ //Function to show the result of the game
	
	if ((user == 'r' && machine == 's') || (user == 'p' && machine == 'r') // If 'user' equal 'r' and 'machine' equal 's' or 'user' equal 'p' and 'machine' equal 'r'
		    ||(user == 's' && machine == 'p')) { // or 'user' equal 's' and 'machine' equal 'p'. 
		System.out.println("The human player won."); //Print The human player won. 		
	}
	else if (user == machine) { //Else if 'user' equal 'machine
		System.out.println("Tied"); //Print Tied
	}
	else
		System.out.println("The machine won."); //Else print The machine won.
}//close method

}//close class Game Rps   