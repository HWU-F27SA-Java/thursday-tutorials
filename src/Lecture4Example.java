import java.util.Scanner;

public class Lecture4Example {

	public static void main(String[] args) {
		// Write a program that reads two numbers 
		// and prints the sign of their product without performing the calculation.
		
		// input 2 and 3 , output = the product is positive
		// input -2 and 3, output = the product is negative
		// + x + = + ;  - x - = +  
		// + x - = - ; - x + = - 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input first number");
		int num1 = s.nextInt();
		System.out.println("Input second number");
		int num2 = s.nextInt();
		
		if(num1 == 0 || num2 == 0) {
			System.out.println("The product is zero");
		}
		//if non-zero
		else {
			if((num1 > 0 && num2 > 0)||(num1 < 0 && num2 < 0)) {
				System.out.println("The product is positive");
			}
			else {
				System.out.println("The product is negative");
			}
		}
		
		
		
	}

}
