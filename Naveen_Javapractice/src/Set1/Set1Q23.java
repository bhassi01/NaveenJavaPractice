package Set1;
//power of a number

import java.util.Scanner;

public class Set1Q23 {
	
	public static void main(String args[]) {

		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		int no = Next.nextInt();
		 int temp =no;
		int Power =Next.nextInt();
		for ( int i=2;i <=Power;i++)
			no=no*temp;
		{
		System.out.println("the power is "+no);	
			
		}
		
		
		
		
	}

}
