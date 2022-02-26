Armstrong Number // 371

public class ArmstrongNumber{
	public static void main(String[] args) {
		int number = 371, temp, remainder, result = 0;
		temp = number;

		while (temp != 0) {
			remainder = temp % 10;
			result += (remainder * remainder * remainder);
			temp = temp / 10;
		}
		if (result == number)
			System.out.println(number + " is Armstrong Number");
		else
			System.out.println(number + "is not Armstrong Number");
	}
}

// Armstrong Number between 100 to 999 // 153, 370, 371, 407
public class ArmstrongNumber{
public static void main(String[] args) {
		int i = 100, remain, arm, num;
		System.out.println("Armstrong numbers between 100 to 999 are");
		while (i < 999) {
			num = i;
			arm = 0;
			while (num > 0) {
				remain = num % 10;
				arm = arm + (remain * remain * remain);
				num = num / 10;
			}
			if (arm == i)
				System.out.println(i + " is Armstrong number");
			i++;
		}
	}
}
