
public class TryCatchFinally {
	public static void main(String args[]) {
		try {
			int [] num = {2,4,5};
			System.out.println("num = "+num[2]);
		}
		catch (Exception e ) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally {
			System.out.println("Program successfully Executed");
		}
	}
}
