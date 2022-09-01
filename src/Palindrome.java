import java.util.Scanner;

public class Palindrome {
//	reads a string (example, “my text”)
//	Invert the string (“txet ym”)
//	Print the inverted string
//	Print “Palindrome” if the string is a palindrome 
//	Original is equal to inverted
	
	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner keyboard = new Scanner(System.in);
		
		String s1 = keyboard.next();
		//text
		String inverted = "";
		//t
		//e t
		//x et
		//t xet
		for(int i = 0; i<s1.length();i++) {
			char c = s1.charAt(i);
			inverted = c + inverted;
		}
		
		System.out.println(inverted);
		
		if(inverted.equals(s1)) {
			System.out.println("Palindrome");
		}
		

	}

}
