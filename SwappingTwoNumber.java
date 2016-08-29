import java.util.Scanner;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		int num1, num2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		num1=s.nextInt();
		num2=s.nextInt();
		System.out.println("Before Swapping:");
		System.out.println("The numbers are :"+num1+"  "+num2);
		System.out.println("After Swapping:");
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("The numbers are :"+num1+"  "+num2);
		s.close();
	}

}
