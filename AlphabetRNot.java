import java.util.Scanner;

public class AlphabetRNot {
	public static void main(String[] args) {
		char c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character:");
		c=s.next().charAt(0);
		int a=(char)c;
		if(a>64&&a<91||a>96&&a<123){
			System.out.println("The given character "+c+" is an alphabet character");
				}
		else
		{
			System.out.println("The given character "+c+" is not an alphabet character");
		}
		s.close();
	}
}
	
