import java.util.Scanner;

public class InputNumbers {

	public static void main(String[] args) {
		// Get input from keyboard
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please input a number");
		int input = s.nextInt();
		
		//System.out.print(input);
		
		// 1) check if positive or negative number
		
		if(input > 0) {
			System.out.println("Positive Number");
		}
		else if(input == 0) {
			System.out.println("Number is Zero");
		}
		else {
			System.out.println("Negative Number");
		}
		
		// 2) if it is an even or odd number
		
		if(input % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		

	}

}
