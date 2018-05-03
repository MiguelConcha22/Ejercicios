package Tarea3;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio6 {
	private static Scanner in;

	public static void main(String[] args) { 
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		//System.out.println(number);
		
		int guess;
		in = new Scanner(System.in);
		
		// prompt the user and get the value
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		System.out.print("Type a number: ");
		guess = in.nextInt();
		
		//show the election and compare to the random number
		System.out.printf("Your guess is: %d \n", guess);
		System.out.printf("The number I was thinking of is: %d \n", number);
		
		if(guess == number) 
			System.out.print("You were correct!");
		else
			System.out.printf("You were off by: %d", Math.abs(guess - number));
	}
}