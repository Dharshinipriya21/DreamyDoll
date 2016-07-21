import java.util.Scanner;
public class CountOfDigits {
	public static void main(String[] args) {
		int num,count=0,rem=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		while (num!=0) {
			rem = num % 10;
			count++;
			num = num/ 10;

		}
		System.out.println(count);
s.close();
	}

}
