package Set1;
//Finding quotient and remainder
import java.util.Scanner;

public class Set1Q5 {
	
	public static void main(String args[]) {
		
		Scanner Next= new Scanner(System.in);
		System.out.println("enter the dividend");
		Float dividend = Next.nextFloat();
		System.out.println("enter the divisor");
		Float divisor =Next.nextFloat();
		 int quotient=(int) (dividend/divisor);
		Float remainder = dividend%divisor;
		System.out.println("remainder "+remainder +"quotient is "+quotient);
		
		
	}

}
