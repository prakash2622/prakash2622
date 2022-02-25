Armstrong Number // 371

public class Hiii {
	public static void main(String[] args) {
		int number = 371, temp, remainder, result = 0;
		temp = number;

		while (temp != 0) {
			remainder = temp % 10;
			result += Math.pow(remainder, 3);
			temp = temp / 10;
		}
		if (result == number)
			System.out.println(number + " is Armstrong Number");
		else
			System.out.println(number + "is not Armstrong Number");
	}
}
