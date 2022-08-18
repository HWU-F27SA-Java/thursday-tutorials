import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// Take an input from the user
		// Print the multiplication table of the number
		// 2 x 1 = 2 2 x 2 =4 2x3 =6 ... 2 x 10 = 20
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please input a number: ");
		int input = s.nextInt();
		
		System.out.println("Multiplication table for "+input+":");
		
		int j = 1;
		while(j<=10) {
			int result = input * j;
			System.out.println(input+" X " +j+" = " +result);
			j++;
		}
		
		
		
		
		
		for(int i = 1;i<=10;i++) {
			int result = input * i;
			System.out.println(input+" X " +i+" = " +result);
		}
		
	}

}
