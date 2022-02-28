
public class MethodOverloadding {
	static  String stuent(String n) {
		return n;
	}
	static int stuent(int x, int y) {
		return x + y;
	}

	static double stuent(double x) {
		return x;
	}
	public static void main(String args[]) {
		String n = stuent("Ram");
		int num1 = stuent(48, 42);
		double num2 = stuent(85);
		System.out.println("Student name : "+n);
		System.out.println("studentsMarks " + num1);
		System.out.println("percentage " + num2);
	}
}
