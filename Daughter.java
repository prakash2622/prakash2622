//parent class  
class GrandFather {
	public void showA() {
		System.out.println("I am grandfather.");
	}
}
//inherits GrandFather properties  
class Father extends GrandFather {
	public void showB() {
		System.out.println("I am father.");
	}
}
//inherits Father properties  
class Son extends Father {
	public void showC() {
		System.out.println("I am son.");
	}
}
//inherits Father properties  
public class Daughter extends Father {
	public void showD() {
		System.out.println("I am a daughter.");
	}
	public static void main(String args[]) {
		Daughter obj = new Daughter();
		obj.showD();
		Son obj1 = new Son();
		obj1.showA();
		obj1.showC();
		obj1.showB();
		
		
	
	}
}