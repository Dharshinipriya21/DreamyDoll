import java.util.Scanner;

public class MaximumNumber {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if((num1>num2)&&(num1>num3)){
			System.out.println(num1+" is greater");
		}
		else if(num2>num3){
			System.out.println(num2+" is greater");
		}
		else{
			System.out.println(num3+" is greater");
		}
		s.close();
	}

}
