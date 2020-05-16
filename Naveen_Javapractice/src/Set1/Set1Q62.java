package Set1;
//check if string is null or empty

import java.util.Scanner;

public class Set1Q62 {
	
public static void main(String args[]) {
			System.out.println("Inside main method");
			Scanner Next = new Scanner(System.in);
			String string = Next.nextLine();
			System.out.println("input string is" + string);
			if(string.length()==0||string==null) {
				System.out.println("Entered string is empty or string is null");
			}
			
			}
	}


