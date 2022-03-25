
public class Switch {
	public static void main(String args[]) {
		int mark = 85;
		switch (mark / 10) {
		case 10:
			System.out.println("Grade A");
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade c");
			break;
		case 6:
			System.out.println("Grade D");
			break;
		default:
			System.out.println("Pass");
		}
	}
}
