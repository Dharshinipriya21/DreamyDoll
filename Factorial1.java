package wipro.activity;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=s.nextInt();
		int fact=1,i=1;
		if(num>=0){
		while(i<=num){
			fact=fact*i;
			i++;
		}
		
		}
		else
		{
			fact=1;
		}
		System.out.println(fact);
		s.close();

	}

}
