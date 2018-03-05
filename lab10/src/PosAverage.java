import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		int total = 0;
		int i = 0;
		int adder;
		int count = 0;
		
		do {
			

			System.out.println("Enter " + i + " Number: ");
			i++;
			adder = input.nextInt();
			
			if(adder > 0) {
				total += adder;
				count++;
			}
			else {
				break;
			}
			

		} while (adder >  0);
		
		System.out.println("Average is : " + total/count);
	}
		
			
}
