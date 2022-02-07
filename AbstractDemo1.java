// abstract class 
abstract class Mobile {
	void VoiceCall() {
		System.out.println("You can Make Voice Call");
	}

	abstract void camera();

	abstract void touchDisplay();
}

class Redmi extends Mobile {
	@Override
	void camera() {
		System.out.println("65MP Mega Pixel Camera");
	}

	@Override
	void touchDisplay() {
		System.out.println("6.43inch Display");

	}
}

class Realme extends Mobile {
	@Override
	void camera() {
		System.out.println("65MP Mega Pixel Camera ");
	}

	@Override
	void touchDisplay() {
		System.out.println("6.5 inch Display");
	}

	void fingerPrint() {
		System.out.println("Fast finger Sensor...");
	}
}

public class AbstractDemo1 {
	public static void main(String args[]) {
		System.out.println("Redmi Note 10S");
		Redmi note = new Redmi();
		note.VoiceCall();
		note.camera();
		note.touchDisplay();
		System.out.println("****************************************");
		System.out.println("realme narzo 50A");
		Realme narzo = new Realme();
		narzo.VoiceCall();
		narzo.camera();
		narzo.touchDisplay();
		narzo.fingerPrint();
	}

}

