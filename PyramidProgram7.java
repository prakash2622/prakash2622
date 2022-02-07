
public class PyramidProgram7 {
	public static void main(String[] args) {
		int rows = 9, i, space, j;
		for (i = rows; i >= 1; i--) {
			for (space = 1; space <= rows - i; space++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
