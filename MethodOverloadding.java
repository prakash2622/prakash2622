
public class MethodOverloadding {
	static String student(String n) {
		return n;
	}

	static int student(int x, int y) {
		return x + y;
	}

	static double student(double x) {
		return x;
	}

	public static void main(String args[]) {

		System.out.println("Student Name : " + MethodOverloadding.student("Ram"));
		int num1 = student(48, 42);
		double num2 = student(85.0);
		System.out.println("studentMarks " + num1);
		System.out.println("percentage " + num2);
	}
}
