
public class PyramidProgram4 {
	public static void main(String[] args) {
		int rows = 9, i, space, j,k;
		for (i = 1; i <= rows; i++) {
			for (space = 0; space <= (rows-i)*2; space++) {
				System.out.print(" ");
			}
			for (j =1; j <i; j++) {
				System.out.print(j+" ");
			}
			for (k = i; k >= 1; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
