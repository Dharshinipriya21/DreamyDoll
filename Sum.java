import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int input;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		input=s.nextInt();
		int len=(int)Math.log10(input)+1;
		int a[]=new int[len];
		int rem=0,i=0,sum=0;
		while(input!=0){
			rem=input%10;
			a[i]=rem;
			input=input/10;
			i++;
		}
		for(int j=0;j<a.length;j++){
			for(int k=0;k<=j;k++){
				sum+=a[j];
			}
		}
		System.out.println(sum);
		s.close();
	}

}
