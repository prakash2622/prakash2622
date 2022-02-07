// Program to Check Whether a Character is a Vowel or Consonant
import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String args[]) {
		char ch;
		boolean lowecase, uppercase;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		ch = sc.next().charAt(0);
		lowecase = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
		uppercase = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
		if (lowecase) {
			System.out.println(ch + " is  vowel");
		} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + "  is Consonant");
		} else {
			System.out.println(ch + "  is not vowel");
		}
	}
}
