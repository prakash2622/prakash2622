PrimeNumbers or Not

public class PrimeNumbers {
	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a  Number");
		int num = input.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");

	}
}

// PrimeNumbers between 1 to 100

public class Hiii {
	public static void main(String[] args) {
		System.out.println("Prime Number between 1 to 100");
		int i, j, count = 0;
		for (i = 2; i <= 100; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;

				}
			}
			if (count == 2)
				System.out.println(i + " is a Prime Number");
		}

	}
}
