import java.util.Scanner;

public class EvenOrOddNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any one Number 1 to 100 : ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println(a + " is even Number ");
		} else {
			System.out.println(a + " is odd Number ");
		}
	}

}

