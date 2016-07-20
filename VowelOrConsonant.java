import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		char c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character:");
		c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
			System.out.println(c+" is an vowel");
		}
		else{
			System.out.println(c+" is a consonant");
		}
		s.close();
	}
