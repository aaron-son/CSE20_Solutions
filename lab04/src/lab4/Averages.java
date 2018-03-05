package lab4;
import java.util.Scanner;

public class Averages
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);

		System.out.println("How much do you weigh in lbs?");


		float weight  = input.nextFloat();

		System.out.println("Your weight in kgs is: " + weight/2.2);
	}
}