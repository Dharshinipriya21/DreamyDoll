public class Factorial {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int i = 1, fact = 1;
		if (num == 0 || num == 1) {
			System.out.println("Factorial of "+num+"is 1");
		} else {
			do {
				fact = fact * i;
				i++;
			} while (i <= num);

			System.out.println("Factorial of "+num+" is "+fact);
		}

	}
