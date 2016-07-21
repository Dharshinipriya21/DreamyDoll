import java.util.Scanner;

public class NoOfWords {
	public static void main(String[] args) {
		String s;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string:");
		s = s1.nextLine();
		String a[] = s.split(" ");
		System.out.println("Number of words in a given string: "+a.length);
		s1.close();
	}

}
