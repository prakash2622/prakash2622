ReverseNumber // 12345-> 54321

public class Hiii {
	public static void main(String[] args) {
	int num = 12345;
	int reverse = 0;
	System.out.println("Before Number "+num);
	while(num!=0) {
		int remain = num%10;
		 reverse = reverse *10 + remain;
		 num = num/10;
	}

	System.out.println("\nAfter Reverse Number : "+reverse);
	}
}
