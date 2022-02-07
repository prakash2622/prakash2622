
public class PyramidPattern3 {
	public static void main(String[] args) {
		int rows = 9, i, space, j;
		for (i = 1; i <=rows; i++) {
			for (space = 1; space <= rows-i; space++) {
				System.out.print(" ");
			}
			for (j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
