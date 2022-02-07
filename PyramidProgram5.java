
public class PyramidProgram5 {
	public static void main(String[] args) {
		int rows = 9, i, space, j, k;
		for (i = rows; i >= 1; i--) {
			for (space = 1; space <= i * 2; space++) {
				System.out.print(" ");
			}
			for (j = i; j <= rows; j++) {
				System.out.print(j + " ");
			}
			for (k = rows - 1; k >= i; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
