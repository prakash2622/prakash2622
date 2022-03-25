
// array is a collection of similar type of elements , fixed size of number.
import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		int n, total = 0, percentage;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of subject :");
		n = scan.nextInt();
		int marks[] = new int[n];
		System.out.println("Enter the marks out of 100 :");
		for (int i = 0; i < n; i++) {
			marks[i] = scan.nextInt();
			total += marks[i];
		}
		percentage = total / n;
		System.out.println("sum : " + total);
		System.out.println("percentage : " + percentage);
	}
}
