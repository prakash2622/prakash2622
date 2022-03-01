 class Employee {
	 void salary() {
		int salary = 40000;
		System.out.println("employee salary = " + salary);
	}
}

class Programmer extends Employee {
	void bonus() {
		int bonus = 10000;
		System.out.println("employee bonus = " + bonus);
	}
}

public class Inheritance {
	public static void main(String args[]) {
		Programmer obj = new Programmer();
		obj.salary();
		obj.bonus();
	}
}
