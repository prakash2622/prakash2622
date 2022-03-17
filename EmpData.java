import java.util.*;

public class EmpData {
	public static void main(String args[]) throws Exception {
		System.out.println("\t\t\t\t\t Employee Details");
		System.out.println();
		Scanner input = new Scanner(System.in);

		ArrayList<Employee> emp = new ArrayList<Employee>();
		try {
			System.out.print("Number of Employee Details : ");
			int num = (Integer.parseInt(input.nextLine()));
			for (int i = 0; i < num; i++) {
				Employee emps = new Employee();
				System.out.print("Employee Id : ");
				emps.setEmpId(Integer.parseInt(input.nextLine()));
				System.out.print("Employee name : ");
				emps.setEmpName(input.nextLine());
				System.out.print("Date of Joining (dd/MM/yyyy): ");
				emps.setDateOfJoin(input.nextLine());
				System.out.print("Gender : ");
				emps.setgetGender(input.nextLine());
				emp.add(emps);
				System.out.println("******** Individual details entered successfully ********");
				System.out.println();
			}
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException occured");
		}
		System.out.println("+---------+-----------+-----------+----------+");
		System.out.println("| Emp Id  | Emp Name  | Join Date | Gender   |");
		System.out.println("+---------+-----------+-----------+----------+");
		for (int i = 0; i < emp.size(); i++) {
			System.out.println("| " + emp.get(i).getEmpId() + "      | " + emp.get(i).getEmpName() + "        | "
					+ emp.get(i).getDateOfJoin() + "  |  " + emp.get(i).getGender() + "       |");
			System.out.println("+---------+-----------+-----+----------+");
		}
		System.out.println();
		int menu = 4;
		do {
			System.out.println("\t1. View Employee Detail \t2. Add Employee \t3.Remove Employee \t4. Exit");
			System.out.println();
			System.out.println("Enter a choice: ");
			menu = input.nextInt();
			if (menu == 1) {
				System.out.println("Enter Employee Id");
				int empNo = input.nextInt();
				for (int i = 0; i < emp.size(); i++) {
					if (emp.get(i).getEmpId() == empNo) {
						System.out.println("+---------+-----------+-----------+----------+");
						System.out.println("| Emp Id  | Emp Name  | Join Date | Gender   |");
						System.out.println("+---------+-----------+-----------+----------+");
						System.out.println(
								"| " + emp.get(i).getEmpId() + "      | " + emp.get(i).getEmpName() + "        | "
										+ emp.get(i).getDateOfJoin() + "  |  " + emp.get(i).getGender() + "       |");
						System.out.println("+---------+-----------+-----+----------+");
					}
				}
			} else if (menu == 2) {
				try {
					Employee emps = new Employee();
					System.out.print("Employee Id : ");
					emps.setEmpId(input.nextInt());
					System.out.print("Employee name : ");
					input.nextLine();
					emps.setEmpName(input.nextLine());
					System.out.print("Date of Joining (dd/MM/yyyy): ");
					emps.setDateOfJoin(input.nextLine());
					System.out.print("Gender : ");
					emps.setgetGender(input.nextLine());
					emp.add(emps);
					System.out.println("******** Individual details entered successfully ********");
					System.out.println();
				} catch (NumberFormatException e) {
					System.out.println("NumberFormatException occured");
				}
				System.out.println("+---------+-----------+-----------+----------+");
				System.out.println("| Emp Id  | Emp Name  | Join Date | Gender   |");
				System.out.println("+---------+-----------+-----------+----------+");
				for (int i = 0; i < emp.size(); i++) {
					System.out
							.println("| " + emp.get(i).getEmpId() + "      | " + emp.get(i).getEmpName() + "        | "
									+ emp.get(i).getDateOfJoin() + "  |  " + emp.get(i).getGender() + "       |");
					System.out.println("+---------+-----------+-----+----------+");
				}
				System.out.println();
			} else if (menu == 3) {
				System.out.println("Enter Employee Id");
				int empNo = input.nextInt();
				for (int i = 0; i < emp.size(); i++) {
					if (emp.get(i).getEmpId() == empNo) {
						emp.remove(i);
					}
				}
				System.out.println("+---------+-----------+-----------+----------+");
				System.out.println("| Emp Id  | Emp Name  | Join Date | Gender   |");
				System.out.println("+---------+-----------+-----------+----------+");
				for (int i = 0; i < emp.size(); i++) {
					System.out
							.println("| " + emp.get(i).getEmpId() + "      | " + emp.get(i).getEmpName() + "        | "
									+ emp.get(i).getDateOfJoin() + "  |  " + emp.get(i).getGender() + "       |");
					System.out.println("+---------+-----------+-----+----------+");
				}

			}
		} while (menu > 4);
		System.out.println("Students details are successfully uploaded....\nThank You..");
	}

	static class Employee {
		private int EmpId;
		private String DateOfJoin;
		private String EmpName;
		private String EmpGender;

		public int getEmpId() {
			return EmpId;
		}

		public void setEmpId(int empId) {
			EmpId = empId;
		}

		public String getDateOfJoin() {
			return DateOfJoin;
		}

		public void setDateOfJoin(String dateOfJoin) {
			DateOfJoin = dateOfJoin;
		}

		public String getEmpName() {
			return EmpName;
		}

		public void setEmpName(String empName) {
			EmpName = empName;
		}

		public String getGender() {
			return EmpGender;
		}

		public void setgetGender(String empGender) {
			EmpGender = empGender;

		}
	}
}
