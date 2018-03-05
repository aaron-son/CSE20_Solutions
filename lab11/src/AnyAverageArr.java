import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the average of any numbers ");
	    System.out.println("Please choose amount of numbers to average : ");

		int max = input.nextInt(); 
		
		int[]arr1 = new int[max+1];

		int i = 0;
		int total = 0;
		// For-loop to calculate 
		for (i = 0;i < max;i++) {
			System.out.print("Please enter "+  i + " number: ");
			arr1[i+1] = input.nextInt();
			total += arr1[i+1];
			
		}

		System.out.println("The numbers being averaged: ");

		for (i = 1; i <= max; i++) {
				System.out.print(arr1[i] + " ");
				
				if(i % 5 == 0 && i > 0) {
					System.out.println();
				}

		}
			

		System.out.println("Average is : " + total/max);

	}

}
