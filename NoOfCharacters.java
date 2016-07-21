import java.util.Scanner;

public class NoOfCharacters {
	public static void main(String[] args) {
		String s;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string:");
		s = s1.nextLine();
		System.out.println("Number of characters in a given string: "+s.length());
		s1.close();
	}

}
