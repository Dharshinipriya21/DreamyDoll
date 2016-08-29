import java.util.Scanner;

public class DigitReverse {

	public static void main(String[] args) {
		int num;
		String str="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		int rem=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			str+=rem;
		}
		System.out.println("Reversed digit: "+str);
		s.close();
	}

}
