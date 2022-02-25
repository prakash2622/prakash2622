// Factor Numbers

public class FactorNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a  Number");
		int num = input.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i + "" + " is Factors number ");
			}
		}
	}
}
