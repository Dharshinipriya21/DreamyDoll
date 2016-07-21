public class PrimeOrNot {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please enter an integer argument");
			System.exit(0);
		} else {
			int num = Integer.parseInt(args[0]);
			int count = 0;
			int n = num / 2;
			if (n > 0) {
				for (int i = 2; i < n; i++) {
					if (num % i == 0) {
						System.out.println(num + " is not a prime number");
						count = 1;
						break;
					}
				}

				if (count == 0) {
					System.out.println(num + " is a prime number");
				}
			} else if (num == 1 || num == 0) {
				System.out.println(num
						+ " is neither prime nor composite number");
			} else {
				System.out.println("invalid");
			}

		}
	}
}
