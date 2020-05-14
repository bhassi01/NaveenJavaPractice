package Set1;
//Printing Fibonacci series

import java.util.Scanner;

public class Set1Q17 {
	
	public static void main(String args[]) {

		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		int no = Next.nextInt();
		int sum =0;
		int a =0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		 if ( no>2) {
		for ( int k=0;k<=no-3;k++) {
			
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
		}
		 }
		
		
		
		
	}

}
