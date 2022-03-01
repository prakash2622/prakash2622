class Bike {
	void honda() {
		System.out.println("Honda Bikes Prices");
	}
}

class HondaSP extends Bike {
	void price() {
		System.out.println("Honda SP price = 85000");
	}
}

class HondaActiva extends Bike {
	void price1() {
		System.out.println("Honda Activa price = 75000");
	}
}

public class hierarchicalInher {
	public static void main(String args[]) {
		HondaActiva bike = new HondaActiva();
		bike.price1();
		bike.honda();
		HondaSP sp = new HondaSP();
		sp.price();
	}

}
