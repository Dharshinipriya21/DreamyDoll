import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		int sum = 0, rem = 0;
		while (num!=0) {
			rem = num % 10;
			sum = sum + rem;
			num = num/ 10;

		}
		System.out.println("Sum is " + sum);
s.close();
	}

}
