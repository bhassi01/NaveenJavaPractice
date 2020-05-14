package Set1;

//program to multiply floating numbers
import java.util.Scanner;

public class Set1Q3 {

	public static void multiply(Float a, Float b) {
		System.out.println("Inside Sum method");
		Float c = a*b;
		System.out.println("The productof the numbers is -->" + c);
	}

	public static void main(String args[]) {
		System.out.println("Inside main method");
		System.out.println("Enter first number");
		Scanner Next = new Scanner(System.in);
		Float N1 = Next.nextFloat();
		System.out.println("Enter second number");
		Next = new Scanner(System.in);
		Float N2 = Next.nextFloat();
		multiply(N1, N2);
		System.out.println("Exiting main method");

	}
}