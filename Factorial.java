// Factorial 5-> 1*2*3*4*5=120;
public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial : " + factorial);
	}
}
