// Fibonacci Series // 5-> 0 1 1 2 3 

public class Hiii {
	public static void main(String[] args) {
		int a = 0, b = 1, temp, n = 5;
		for (int i = 0; i < n; i++) {

			System.out.println(a);
			temp = a + b;
			a = b;
			b = temp;
		}

	}
}
