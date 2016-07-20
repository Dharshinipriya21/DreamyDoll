import java.util.Scanner;

public class PositiveOrNegativeOrZero {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		if(num>0){
			System.out.println(num+" is a positive");
		}
		else if(num<0){
			System.out.println(num+" is a negative");
		}
		else if(num==0)
		{
			System.out.println(num+" is zero");
		}
		s.close();

	}

}
