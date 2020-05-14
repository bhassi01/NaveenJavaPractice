package Set1;

import java.util.Scanner;

//swapping two numbers

public class Set1Q6 {
	public static void main(String args[]) {
		System.out.println("Inside main method");
		System.out.println("Enter first number");
		Scanner Next = new Scanner(System.in);
		int a = Next.nextInt();
		System.out.println("value of a is" + a);
		System.out.println("Enter second number");
		int b = Next.nextInt();
		System.out.println("value of b is" + b);

		/*
		 * Using third variable int c = b; b = a; a=c;
		 */
		b = a + b;
		a = b - a;
		b = b - a;

		System.out.println("Swapped values are a " + a + "Swapped value of b is " + b);

	}
}
