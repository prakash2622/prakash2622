class User{
	String name;
	int age;
	User(String n, int a){
		this.name = n;
		this.age = a;
	}
	public void display() {
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
	}
}
class Programmer extends User{
	String companyName;
	Programmer(String n, int a, String c){
		super(n,a);
		this.companyName = c;
	}
	public void display() {
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("companyName : "+companyName);
}
}
public class MethodOverridding {
	public static void main(String args[]) {
		Programmer obj = new Programmer("Ravi", 22, "InfoTech");
		obj.display();
	}
}


