public class NumberPalindrome{

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		int n=num;
		int reverse=0, remainder = 0;
		while(num>0){
			remainder=num%10;
			reverse=(reverse*10)+remainder;
			num=num/10;
		}
		if(remainder==n){
			System.out.println(n+" is a palindrome");
		}
		else{
			System.out.println(n+" is not a palindrome");
		}
		}
		

	}


