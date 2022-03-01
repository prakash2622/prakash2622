
public class Constructor {
	int x;
	String name;

	Constructor() {
		x = 5;
		name = "java";
	}

	public static void main(String args[]) {
		Constructor obj = new Constructor();
		System.out.println("x = " + obj.x);
		System.out.println("Language Name = " + obj.name);

	}

}
