package Set1;

//program to print ASCII value of a string/character
import java.util.Scanner;

public class Set1Q4 {

	public static void main(String args[]) {

		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		String inputString = Next.nextLine();
		System.out.println("Input String is" + inputString);
		for (int i = 0; i <= inputString.length() - 1; i++) {

			// -------Printing through casting----------------
			int ASCII = (int) inputString.charAt(i);
			System.out.println("Ascii value of character " + inputString.charAt(i) + " is " + ASCII);
			
		}
		
		

	}

}
