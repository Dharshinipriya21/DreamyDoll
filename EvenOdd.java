import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
	    if(num%2==0){
			System.out.println(num+" is an Even number");
		}
		else
		{
			System.out.println(num+" is an Odd number");
		}
		s.close();
	}
}
