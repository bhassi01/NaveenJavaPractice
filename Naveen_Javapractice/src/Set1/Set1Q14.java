package Set1;
//sum of natural numbers

import java.util.Scanner;

public class Set1Q14 {
	
	public static void main(String args[]) {
		
		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		int no = Next.nextInt();
		int sum =(no*(no+1))/2;
		System.out.println("Sum of numbers till the  count is --> "+ sum);
		
		
	}

}
