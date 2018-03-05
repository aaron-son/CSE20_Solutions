import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the max number:");
		
		int total = 0;
		int max = input.nextInt();
		int i = 0;
		
		do {
			i++;
			total = total + i;
			System.out.println("Number " + i);
		} while ( i < max);
		
		System.out.println("Sum of All is " + total);
	}

}
