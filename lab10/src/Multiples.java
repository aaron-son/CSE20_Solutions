import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int max = input.nextInt();
		
		System.out.println("Enter the Base: ");
		int base = input.nextInt();
		
		int total = 0;
		
		for (int i = base; i <= max; i++) {
			
			if(i%base == 0) {
				total += base;
				System.out.println("Number " +  total);
			}	
		}
	}
}
