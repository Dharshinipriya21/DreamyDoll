import java.util.Scanner;

public class SumOfPowerOfDigits {
	public static void main(String[] args) {
		int input,output=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		input=s.nextInt();
		int len=(int)Math.log10(input)+1;
		int a[]=new int[len];
		int rem=0,i=0;
		while(input!=0){
			rem=input%10;
			a[i]=rem;
			input=input/10;
			i++;
		}
		int t[]=new int[a.length];
		int l=0;
		for(int j=a.length-1;j>=0;j--){
			t[l]=a[j];
			l++;
		}
		
		int sum=0;
		for(int j=0;j<t.length;j++){
			output=1;
			for(int k=0;k<4;k++){
			output*=a[j];
		}
		
		sum+=output;
		}
		System.out.println(sum);
		s.close();

	}

}
