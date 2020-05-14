package Set1;
//Find Largest of three numbers

import java.util.Scanner;

public class Set1Q9 {

	public static void main(String args[]) {
		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		System.out.println("Enter the  first no to be checked");
		int a = Next.nextInt();
		System.out.println("Enter the  second no to be checked");
		int b = Next.nextInt();
		System.out.println("Enter the  third no to be checked");
		int c = Next.nextInt();
		if (b > c) {
			if (a > b) {
				System.out.println(+a + "is the largest number");
			} else {
				System.out.println(+b + "is largest");
			}
		} else if (c > b) {
			if (a > c) {
				System.out.println(+a + " is the largest number");
			} else {
				System.out.println(+c + " is the largest number");
			}

		}
	}

}
