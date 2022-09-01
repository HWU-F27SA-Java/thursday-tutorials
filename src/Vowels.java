import java.util.Scanner;

public class Vowels {
//	reads a string (example, “This is a text”)
//	Searches all vowels
//	Replace them with a dot
//	Print the resulting string

	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner keyboard = new Scanner(System.in);
		
		String s1 = keyboard.nextLine();
		
		//This is a text
		//Th.s .s a t.xt
		
		char[] chars = s1.toCharArray();
		char[] vowels = {'a','e','i','o','u'};
		
	
		
		for(int i = 0; i<chars.length;i++) {
			char c = chars[i];
			//check if vowel
			//if it is replace with "."
			for(int j=0;j<vowels.length;j++) {
				if(c==vowels[j]) {
					chars[i] = '.';
					break;
				}
			}
		}
		String result = new String(chars);
		System.out.println(result);

	}

}
