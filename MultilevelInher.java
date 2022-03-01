class Animals {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animals {
	void bark() {
		System.out.println("barking....");
	}
}

class BabyDog extends Dog1 {
	void weep() {
		System.out.println("weeping...");
	}
}

public class MultilevelInher {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}

}
