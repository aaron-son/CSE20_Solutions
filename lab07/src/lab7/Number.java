package lab7;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
	
		double num = input.nextInt();
		
		if(num <= 25) {

			System.out.println((char)(num +'A'));
		}
		else {
			System.err.println("Not a valid number");
		}
		
	
	}

}
