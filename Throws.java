
import java.io.*;

	public class Throws{
		   public int division(int a, int b) throws ArithmeticException{
		      int t = a/b;
		      return t;
		   }
		   public static void main(String args[]){
			   Throws obj = new Throws();
		      try{
		         System.out.println(obj.division(15,0));
		      }
		      catch(ArithmeticException e){
		         System.out.println("You shouldn't divide number by zero");
		      }
		   }
		}
