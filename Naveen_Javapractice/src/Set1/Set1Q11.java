package Set1;
//fing leap year

import java.util.Scanner;

public class Set1Q11 {

	public static void main(String args[]) {
		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		System.out.println("Enter the year to be checked");
		int no = Next.nextInt();
		if (no % 4 == 0) {
			System.out.println("Year is leap year");
		} else {
			System.out.println("Year is a non leap year");
		}
		

	}

}
