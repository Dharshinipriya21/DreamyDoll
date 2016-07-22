import java.util.Scanner;

public class SumOfNnumbers {
	public static void main(String args[]){
	int size = 0,sum=0;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size:");
	size=s.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the elements");
	for(int i=0;i<size;i++){
		a[i]=s.nextInt();
		sum+=a[i];
	}
	System.out.println(sum);
	s.close();
}
}
