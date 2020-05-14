package Set1;
//to check no is prime or not

import java.util.Scanner;

public class Set1Q25 {
	public static void main(String args[]) {

		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		int no = Next.nextInt();
		boolean flag = false;
		int m =no/2;
		for ( int i=2;i<=m;i++) {
			if(no%i==0)
			{
				flag= true;
				break;
			}
		}
		 
		 if(!flag)
		 {System.out.println( no+"  No is prime");}
		 
		 if(flag)
		 {
			 System.out.println( no +"  No is not prime");
		 }
			
	}

}
