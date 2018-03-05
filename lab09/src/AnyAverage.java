import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int total = 0;
		int max = input.nextInt();
		int count = 0;
		int i = 0;
		int adder = 0;
		while ( i < max) {
			
			adder = input.nextInt();
			i++;
			count++;
			total = total + adder;
			
		}
		
		System.out.println("Average of All is " + total/count);

	}

}
