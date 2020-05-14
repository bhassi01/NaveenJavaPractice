package Set1;
//Program to print characters from A to Z

public class Set1Q20 {
	public static void main(String args[]) {
		char ch = 'A';
		int Ascii = (int) ch;

		System.out.println(Ascii +"------->"+ch);
		for (int i = 0; i < 25; i++) {
			Ascii = Ascii + 1;
			System.out.println(Ascii + "------->" + (char) Ascii);
		}

	}
}