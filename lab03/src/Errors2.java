import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		int theSquare = 0;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a number and I will ");
		System.out.print("square it for you:  ");
		number =  keyboard.nextInt();

		theSquare = number * number;

		System.out.print(number + " squared = ");
		System.out.println(theSquare);
	}
}