import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String original="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		original=s.next();
		StringBuffer sb=new StringBuffer(original);
		System.out.println(sb.reverse());
		s.close();
	}

}
