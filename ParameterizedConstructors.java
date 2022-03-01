class Parameterized {
	String cars;
	int id;

	Parameterized(String cars, int id) {
		this.cars = cars;
		this.id = id;
		System.out.println("Name of Car = " + cars + id);
	}
}

public class ParameterizedConstructors {
	public static void main(String args[]) {
		Parameterized p1 = new Parameterized("Hyundai ", 1);
		Parameterized p2 = new Parameterized("Toyota ", 2);
		Parameterized p3 = new Parameterized("Honda ", 3);
	}
}
