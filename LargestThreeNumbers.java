import java.util.Scanner;

public class LargestThreeNumbers {
	public static void main (String args[]) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 3 Numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if (a>=b&&a>=c) {
			System.out.println(a+": is largest number");
		}
		else if (b>=a&&b>=c) {
			System.out.println(b+": is largest number");
		}
		else {
			System.out.println(c+ ": is largest  number");
		}
	}
}
