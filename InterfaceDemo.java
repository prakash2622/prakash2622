
interface Language {
	void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language {

	// implementation of abstract method
	public void getName(String name) {
		System.out.println("Programming Language: " + name);
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("Java");
	}
}