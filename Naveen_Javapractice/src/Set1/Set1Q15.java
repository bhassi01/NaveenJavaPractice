package Set1;
//Calculate factorial

import java.util.Scanner;

public class Set1Q15 {
	public static void main(String args[]) {

		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		int factorial = 1;
		int no = Next.nextInt();

		if (no > 0) {
			for (int i = no; no > 0; no--) {
				factorial = factorial * no;
				
			}
			System.out.println("Factorial is-->" + factorial);
		}

		else {
			System.out.println("1");
		}

	}

}
