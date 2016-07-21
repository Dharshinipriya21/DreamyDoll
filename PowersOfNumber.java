import java.util.Scanner;

public class PowersOfNumber

{
	public static void main(String[] args) {
		int num;
		int exponent;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = scan.nextInt();
		System.out.println("Enter the exponent:");
		exponent = scan.nextInt();
		System.out.println(num + "^" + exponent + " = "
				+ (int) (Math.pow(num, exponent)));
		scan.close();
	}

}
