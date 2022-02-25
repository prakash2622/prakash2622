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
