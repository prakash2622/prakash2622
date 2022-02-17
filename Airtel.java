import java.util.*;

public class Airtel {

	static Stack<BackStack> backStack = new Stack<BackStack>();

	public static void main(String args[]) {
		for (String choice : getChoices(0, 0)) {
			System.out.println(choice);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your option : ");
		int choice = input.nextInt();
		backStack.push(new BackStack(1, choice));
		print(1, choice);
		System.out.println();
		System.out.println("Stacktop" + backStack.peek().level);

		System.out.println("Enter your option : ");
		choice = input.nextInt();
		backStack.push(new BackStack(2, choice));
		print(2, choice);
		/*for (String choiceString : getChoices(2, choice)) {
			System.out.println(choiceString);
		}*/
		System.out.println("Enter your option : ");
		choice = input.nextInt();
		if (choice == 9) {
			backStack.pop();
			BackStack top = backStack.peek();
			print(top.level, top.choice);
		} else {
			backStack.push(new BackStack(3, choice));
		}
	}

	private static void print(int level, int choice) {
		for (String choiceString : getChoices(level, choice)) {
			System.out.println(choiceString);
		}
	}

	static ArrayList<String> getChoices(int level, int choice) {
		ArrayList<String> choiceList = new ArrayList();
		if (level == 0) {
			choiceList.add(Level1.OPTION_1.toString());
			choiceList.add(Level1.OPTION_2.toString());
			choiceList.add(Level1.OPTION_3.toString());
		} else if (level == 1) {

			switch (choice) {
			case 1:
				choiceList.add(Level2.OPTION_1.toString());
				choiceList.add(Level2.OPTION_2.toString());
				choiceList.add(Level2.OPTION_3.toString());
				choiceList.add(Level2.OPTION_4.toString());
				break;
			case 2:
				choiceList.add(Level3.OPTION_1.toString());
				choiceList.add(Level3.OPTION_2.toString());
				choiceList.add(Level3.OPTION_3.toString());
				choiceList.add(Level3.OPTION_4.toString());
				break;
			}
		} else if (level == 2) {
			switch (choice) {
			case 1:
				choiceList.add(Recharge.OPTION_1.toString());
				choiceList.add(Recharge.OPTION_2.toString());
				choiceList.add(Recharge.OPTION_3.toString());
				break;
			case 2:
				choiceList.add(Caller_Tune.OPTION_1.toString());
				choiceList.add(Caller_Tune.OPTION_2.toString());
				choiceList.add(Caller_Tune.OPTION_3.toString());
				choiceList.add(Caller_Tune.OPTION_4.toString());
				choiceList.add(Caller_Tune.OPTION_5.toString());
				break;
			case 3:
				choiceList.add(Dth.OPTION_1.toString());
				choiceList.add(Dth.OPTION_2.toString());
				choiceList.add(Dth.OPTION_3.toString());
				choiceList.add(Dth.OPTION_4.toString());
				break;
			case 4:
				choiceList.add(NewOffers.OPTION_1.toString());
				choiceList.add(NewOffers.OPTION_2.toString());
				choiceList.add(NewOffers.OPTION_3.toString());
				choiceList.add(NewOffers.OPTION_4.toString());
				choiceList.add(NewOffers.OPTION_5.toString());
			}
		}
		return choiceList;
	}

	static class BackStack {
		private int level;
		private int choice;

		BackStack(int level, int choice) {
			this.level = level;
			this.choice = choice;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public int getChoice() {
			return choice;
		}

		public void setChoice(int choice) {
			this.choice = choice;
		}

	}

	public enum Level1 {
		OPTION_1("1.English"), OPTION_2("2.Tamil"), OPTION_3("3.Hindi");

		private final String text;

		Level1(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level2 {
		OPTION_1("1.Rechare"), OPTION_2("2.Caller_Tune"), OPTION_3("3.DTH"), OPTION_4("4.New Offers");

		private final String text;

		Level2(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level3 {
		OPTION_1("1.ரீஜார்ச்"), OPTION_2("2.காலர் டியுன்"), OPTION_3("3.டிடிஎச்"), OPTION_4("4.புதிய ஆஃபர்");

		private final String text;

		Level3(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Recharge {
		OPTION_1("1.Rechare through Airtel Payments Bank Account"), OPTION_2("2.Coupon Recharge"), OPTION_3("9.Back");

		private final String text;

		Recharge(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Caller_Tune {
		OPTION_1("1.Arabic Kuthu"), OPTION_2("2.Mudhal Nee Mudivu Nee"), OPTION_3("3.Naaga Vera Maari"),
		OPTION_4("4.Two Two Two"), OPTION_5("9.Back");

		private final String text;

		Caller_Tune(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Dth {
		OPTION_1("1.Airtel DTH HD Plan Rs.251=49Channels+30D"), OPTION_2("2.Airtel DTH ₹ 285 Pack = 68 Channels+30D"),
		OPTION_3("3.Airtel DTH ₹ 252 Pack = 78 Channels+30D"), OPTION_4("9.Back");

		private final String text;

		Dth(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum NewOffers {
		OPTION_1("1.Recharge of Rs INR265.00 is successful for your Airtel Mobile on 28-03-2022 "),
		OPTION_2("2.Recharge of Rs INR479.00 is successful for your Airtel Mobile on 28-04-2022"),
		OPTION_3("3.Recharge of Rs INR299.00 is successful for your Airtel Mobile on 28-03-2022 "),
		OPTION_4("4.Recharge of Rs INR549.00 is successful for your Airtel Mobile on 28-04-2022 "), OPTION_5("5.Back");

		private final String text;

		NewOffers(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}
}
