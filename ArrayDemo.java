public class ArrayDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		String name = "Prakash";
		System.out.println("Student Name : "+name);
		int mark [] = new int [5];
		System.out.println("Enter tamil Mark");
		mark [0] = input.nextInt();
		System.out.println("Enter English Mark");
		mark [1] = input.nextInt();
		System.out.println("Enter Maths Mark");
		mark [2] = input.nextInt();
		System.out.println("Enter Science Mark");
		mark [3] = input.nextInt();
		System.out.println("Enter Social Science Mark");
		mark [4] = input.nextInt();
		
		for(int marks : mark) {
			total = total+marks;
		}
		System.out.println("Total Marks : "+total);
	}
}
