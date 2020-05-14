package Set1;
import java.util.Scanner;

//Programme to print number entered by user
public class Set1Q1 {
	
	public static void main(String args[])
	{
		
		System.out.println("Inside main method");
		System.out.println("Enter the number");
		Scanner Next=new Scanner(System.in);
		Integer no = Next.nextInt();
		System.out.println("User entered the number as-->"+ no);
		System.out.println("Exiting main method");
	}

}
