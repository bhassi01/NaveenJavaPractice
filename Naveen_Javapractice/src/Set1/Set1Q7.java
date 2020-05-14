package Set1;

import java.util.Scanner;

//check number is even or odd

public class Set1Q7 {

	public static void main(String args[]) {

		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		System.out.println("Enter the no to be checked");
		int no = Next.nextInt();
		if (no % 2 == 0) {
			System.out.println("no is even");
		} else {
			System.out.println("No is odd");
		}
	}

}
