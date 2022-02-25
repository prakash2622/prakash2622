
// Sum of Average Numbers // 5-> 10+20+30+40+50 = 150  Average = 150/5=30

public class Hiii {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Number of sum :");
		int num = in.nextInt();
		int total = 0;
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter a number");
			int sum = in.nextInt();
			total += sum;
		}
		System.out.println("Total : " + total);
		System.out.println("Average : " + (total / num));
	}
}
