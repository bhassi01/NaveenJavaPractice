package Set1;
//Count no of vowels and consonants

import java.util.Scanner;

public class Set1Q50 {
	public static void main(String args[]) {
		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		String string = Next.nextLine();
		System.out.println("input string is" + string);
		string = string.replace(" ", "");
		string= string.toLowerCase();
		System.out.println("changed string is" + string);
		string= string.toLowerCase();
		int vowelsCount = 0;
		int consonantCount = 0;
		for (int i = 0; i <= string.length() - 1; i++) {
			Character ch = string.charAt(i);
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {

				++vowelsCount;

			}

			else
				++consonantCount;

		}
System.out.println("Vowels count"+vowelsCount);
System.out.println("Consonant count"+consonantCount);
	}

}
