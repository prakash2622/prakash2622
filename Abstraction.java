abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}
class PNB extends Bank{
	int getRateOfInterest() {
		return 8;
	}	
}
public class Abstraction {
	public static void main(String args[]) {
		SBI s = new SBI();
		PNB p = new PNB();
		System.out.println("Rate of Interest is "+s.getRateOfInterest()+"%");
		System.out.println("Rate of Interest is "+p.getRateOfInterest()+"%");
	}

}
