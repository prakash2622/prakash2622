class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Vanakam zoho");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Num extends Thread{
	public void run() {
		for (int i = 1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Multithreading{
	public static void main(String[] args) throws InterruptedException {
		MyThread obj = new MyThread();
		Num obj1 = new Num();
		obj.start();
		obj1.start();
		if(obj.isAlive()) {
			System.out.println("Waiting");
		}
		obj.join();
		obj1.join();
		System.out.println("Bye....");
	}
	
}
