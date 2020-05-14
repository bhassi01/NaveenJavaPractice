package Set1;
//Generate multiplication table

import java.util.Scanner;

public class Set1Q16 {

	public static void main(String args[]) {

		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		int no = Next.nextInt();
		System.out.println("Multiplication table is as below");
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(+ no+"*"+i+" ="+(no*i));

		}
	}

}
