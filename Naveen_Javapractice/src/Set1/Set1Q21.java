package Set1;
//Calculate no of digits in an integer

import java.util.Scanner;

public class Set1Q21 {
	public static void main(String args[]) {
		System.out.println("Inside main method");
		Scanner Next = new Scanner(System.in);
		 int count=0;
		int no = Next.nextInt();
		if ( no==0) {
			
			System.out.println("only one digit is there");
			
		}
		 if( no>0){
		while((no%10!=0)) {
			no=no/10;
			count++;
		}	 
			 
		 }
		
			
		
		
		System.out.println("no of digits"+ count);
		
		
		
	}

}
