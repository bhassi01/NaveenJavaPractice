package Set1;
//Reverse of a number

import java.util.Scanner;

public class Set1Q22_24 {
	public static void main(String args[]) {
		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		int no = Next.nextInt();
		int temp = no;
		int sum = 0;

		while (no > 0)

		{
			int x = no % 10;
			sum = sum + x;
			no = no / 10;
			if (no>0){
			sum = sum * 10;}

		}
		System.out.println("sum===" + sum);
		System.out.println("no====" + temp);
		if (sum == temp) {

			System.out.println("the no is a palindrome");
		} else {
			System.out.println("No is not a palindrome");
		}

	}

}
