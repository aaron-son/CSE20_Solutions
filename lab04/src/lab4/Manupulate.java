package lab4;

import java.util.Scanner;

public class Manupulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Input two values to calculate type casting");
		float n1 = kbd.nextFloat();
		int n2 = (int) kbd.nextFloat();
		
		char charA = 'A';
		
		System.out.println("Add OUTPUT is " + (int) (n1 + n2)); 
		System.out.println("Sub OUTPUT is " + (int) (n1 - n2)); 
		System.out.println("Mul OUTPUT is " + (int) (n1 * n2)); 
		System.out.println("Div OUTPUT is " + (int) (n1 / n2)); 
		System.out.println("Rem OUTPUT is " + (int) (n1 % n2)); 
		
		System.out.println();
		
		System.out.println("Add OUTPUT is " + (short) (n1 + n2)); 
		System.out.println("Sub OUTPUT is " + (short) (n1 - n2)); 
		System.out.println("Mul OUTPUT is " + (short) (n1 * n2)); 
		System.out.println("Div OUTPUT is " + (short) (n1 / n2)); 
		System.out.println("Rem OUTPUT is " + (short) (n1 % n2)); 
		
		System.out.println();
		
		System.out.println("Add OUTPUT is " + (float) (n1 + n2)); 
		System.out.println("Sub OUTPUT is " + (float) (n1 - n2)); 
		System.out.println("Mul OUTPUT is " + (float) (n1 * n2)); 
		System.out.println("Div OUTPUT is " + (float) (n1 / n2)); 
		System.out.println("Rem OUTPUT is " + (float) (n1 % n2)); 
		
		System.out.println();
		
		System.out.println("Add OUTPUT is " + (double) (n1 + n2)); 
		System.out.println("Sub OUTPUT is " + (double) (n1 - n2)); 
		System.out.println("Mul OUTPUT is " + (double) (n1 * n2)); 
		System.out.println("Div OUTPUT is " + (double) (n1 / n2)); 
		System.out.println("Rem OUTPUT is " + (double) (n1 % n2)); 


	}

}
