package Set1;
//Remove the whitespace

import java.util.Scanner;

public class Set1Q55 {
	public static void main(String args[]) {
		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		String string = Next.nextLine();
		System.out.println("input string is" + string);
		string = string.replace(" ", "");
		System.out.println("String chaanged without white spaces--->"+ string);
	}
	
}