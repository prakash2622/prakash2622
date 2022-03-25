class Birds {
	public void diplayInfo() {
		System.out.println("list of birds and their sounds");
		int a = 5, b = 6;
		System.out.println("a+b = " + (a + b));
	}

	protected void diplayInfo1() {
		System.out.println("Duck it's sound quack......");
	}
}

class Cuckoos extends Birds {
	@Override
	public void diplayInfo() {
		super.diplayInfo();
		System.out.println("Cuckoo it's sound coo......");
	}

	@Override
	protected void diplayInfo1() {
		super.diplayInfo1();
		System.out.println("Peacock it's scream......");
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		Cuckoos obj = new Cuckoos();
		obj.diplayInfo();
		obj.diplayInfo1();

	}
}
