import java.util.Arrays;

public class JaggedArray {
	public static void main(String args[]) {
		int[][] jaggedArray = new int[3][];
		jaggedArray[0] = new int[] { 0, 1, 2, 3 };
		jaggedArray[1] = new int[] { 4, 5 };
		jaggedArray[2] = new int[] { 6, 7, 8 };

		for (int[] row : jaggedArray) {
			for (int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}
 	