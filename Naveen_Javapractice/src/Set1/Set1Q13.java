package Set1;
//To check if a character is alphabet

public class Set1Q13 {
	
	public static void main(String args[]) {
		
		String str= "Happy123";
		for (int i=0;i<=str.length()-1;i++)
		{
		
			if (Character.isDigit(str.charAt(i)))
			{
				System.out.println(str.charAt(i)+"--->is a digit");
				
			}
			else {
				
				System.out.println(str.charAt(i)+"--->is a  character");
			}
			
			
			
		}
		
		
		
	}

}
