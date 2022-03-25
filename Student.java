import java.util.*;

public class Student {
	int rollno, age;
	String name, gender;

	public static void main(String args[]) {
		List<String> name = new ArrayList<String>();
		List<Integer> roll_no = new ArrayList<Integer>();
		List<String> gender = new ArrayList<String>();
		List<Integer> age = new ArrayList<Integer>();
		System.out.println("\t\t\t\t Student Details");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.println("Number of Student");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter a Rollno:");
			roll_no.add(sc.nextInt());
			System.out.println("Enter a Student Name:");
			sc.nextLine();
			name.add(sc.nextLine());
			System.out.println("Enter a age:");
			age.add(sc.nextInt());
			System.out.println("Enter a gender:");
			sc.nextLine();
			gender.add(sc.nextLine());

			System.out.println("********Individual details entered successfully********");
			System.out.println();

		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("NAME          | ROLL_NO           | AGE              | GENDER |");
		System.out.println("--------------------------------------------------------------");

		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i) + "            |   " + roll_no.get(i) + "              |   " + age.get(i)
					+ "             |   " + gender.get(i) + "   |");
			System.out.println("--------------------------------------------------------------");

		}

		int menuChoice = 3;
		do {
			System.out.println("\t\t\tEnter a Student Details");
			System.out.println("\t\t1. Add Student\t2. remove Students\t3. Exit");
			System.out.println("Enter a choice: ");
			Scanner input = new Scanner(System.in);
			menuChoice = Integer.parseInt(input.nextLine());

			if (menuChoice == 1) {
				System.out.println("Enter a Rollno:");
				roll_no.add(sc.nextInt());
				System.out.println("Enter a Student Name:");
				sc.nextLine();
				name.add(sc.nextLine());
				System.out.println("Enter a age:");
				age.add(sc.nextInt());
				System.out.println("Enter a gender:");
				sc.nextLine();
				gender.add(sc.nextLine());
				System.out.println("--------------------------------------------------------------");
				System.out.println("NAME          | ROLL_NO           | AGE              | GENDER |");
				System.out.println("--------------------------------------------------------------");

				for (int i = 0; i < name.size(); i++) {
					System.out.println(name.get(i) + "            |   " + roll_no.get(i) + "              |   "
							+ age.get(i) + "             |   " + gender.get(i) + "   |");
					System.out.println("--------------------------------------------------------------");

				}
			} else if (menuChoice == 2) {
				int menu = 4;
				System.out.println("\t\t1. Remove rollno\t2. remove Name\t3. Remove age\t4. Remove gender");
				Scanner s = new Scanner(System.in);
				menu = Integer.parseInt(s.nextLine());

			}

		} while (menuChoice < 3);
		System.out.println("Student details successfully completed....");

	}

}