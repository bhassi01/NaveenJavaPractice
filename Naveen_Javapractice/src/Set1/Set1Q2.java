package Set1;
//programme to add two integers
import java.util.Scanner;

public class Set1Q2 {

	public static void sum(int a, int b) {
		System.out.println("Inside Sum method");
		int c = a + b;
		System.out.println("The sum of the numbers is -->" + c);
	}

	public static void main(String args[]) {
		System.out.println("Inside main method");
		System.out.println("Enter first number");
		Scanner Next = new Scanner(System.in);
		int N1 = Next.nextInt();
		System.out.println("Enter second number");
		Next = new Scanner(System.in);
		int N2 = Next.nextInt();
		sum(N1, N2);
		System.out.println("Exiting main method");

	}

}
