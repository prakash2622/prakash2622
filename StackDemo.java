import java.util.*;
enum Level1 {
    OPT_1("1.ENGLISH");

	String text;

	Level1(String text) {
		this.text = text;
	}

	public String toString() {
		return text;
	}
}




enum Level11 {
	OPT_11_1("1.RECHARGE"), OPT_11_2("2.CALLERTUNES"), OPT_11_3("3.COMPLAINTS"), OPT_11_4("9.BACK");

	final String text;

	Level11(final String text) {
		this.text = text;
	}

	public String toString() {
		return text;
	}

}

enum Level11_1 {
	OPT_11_1_1("1.DATA PACKS\n"
			+ "Recharge Rs.11 and Get 1GB Data   Validity: Existing Plan"
			+ "Recharge Rs.21 and Get 2GB Data   Validity: Existing Plan\n"
			+ "Recharge Rs.51 and Get 6GB Data   Validity: Existing Plan\n"), OPT11_1_2("2.UNLIMITED PACKS\n"
					+"Recharge Rs.149 and Get Data 1GB/Day, 100 SMS/Day, Talktime:Unlimited, Validity: 20 Days\n"
					+ "Recharge Rs.299 and Get Data 2GB/Day, 100 SMS/Day, Talktime:Unlimited, Validity: 28 Days\n"), OPT_11_1_3("3.TALKTIME PACKS\n"
							+"Recharge Rs.150 and Get TalkTime of Rs.150   Validity: 90 Days\n"
							+"Recharge Rs.220 and Get TalkTime of Rs.220   Validity: 120 Days\n"), OPT11_1_4("9.BACK");

	final String text;

	Level11_1(final String text) {
		this.text = text;
	}

	public String toString() {
		return text;
	}

}
enum Level11_2{
	OPT11_2_1("1.TAMIL SONG\n"
			+ "Arabic Kuthu from Beast\n"
			+ "Mother Song from Valimai\n"
			+ "Yaar Alaippadhu from Maara"),OPT11_2_2("2.ENGLISH SONG\n"
					+ "Despacito\n"
					+ "Shape of You\n"
					+ "Believer"),OP11_2_3("3.HINDI SONG\n"
							+ "Jai Jai ShivShankar from War\n"
							+ "Sultan Title Song from Sultan\n"
							+ "Tum Hi Ho from Aashiqui 2\n"),OPT11_2_4("9.BACK");
String text;
	Level11_2(String text) {
		this.text=text;
	}
	public String toString() {
		return text;
	}
}
enum Level11_3{
	OPT11_3_1("1.NET ISSUE\n"
			+ "Plese Contact 198 for Network and Services Complaints\n"),OPT11_3_2("2.QUIERY CALL\n"
					+ "Please Contact 199 for Plans related queries\n"),OPT11_3_3("3.BALANCE CHECK\n"
							+ "Please Contact 1860-893-3333 for Customer Care\n"),OPT11_3_4("9.BACK");
		String text;
	Level11_3(String text) {
		this.text=text;
	}
	public String toString() {
		return text;
	}
}

public class StackDemo {

	static Stack<BackStack> backStack = new Stack<BackStack>();

	public static void main(String[] args) {
		for (String option : getOptions(0, 0)) {
			System.out.println(option);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option");
		int option = (sc.nextInt());
		backStack.push(new BackStack(1,option));
		print( backStack.peek().getLevel(), option);
		System.out.println();
		System.out.println("Enter the option");
		option = (sc.nextInt());
		backStack.push(new BackStack(backStack.peek().getLevel()+1,option));
		print( 2, option);
		System.out.println();
		System.out.println("Enter the option");
		option = (sc.nextInt());
		do {
		if(option==9) {
			backStack.pop();
			System.out.println();
			
			for (String optionString : getOptions(0, 0)) {
				System.out.println(optionString);
			}
				System.out.println("Enter the option");
				option = (sc.nextInt());
				backStack.push(new BackStack(1,option));
				print( backStack.peek().getLevel(), option);
				System.out.println();
				System.out.println("Enter the option");
				option = (sc.nextInt());
				backStack.push(new BackStack(backStack.peek().getLevel()+1,option));
				print( 2, option);
				System.out.println();
				System.out.println("Enter the option");
				option = (sc.nextInt());
				
			
		}
		}while(true);
		
	}

	public static void print(int level, int option) {
		for (String i : getOptions(level, option)) {
			System.out.println(i);
		}
	}

	static class BackStack {
		int level;
		int option;

		public BackStack(int level, int option) {
			this.level = level;
			this.option = option;

		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public int getOption() {
			return option;
		}

		public void setOption(int option) {
			this.option = option;
		}
	}

	static ArrayList<String> getOptions(int level, int option) {
		ArrayList<String> optionList = new ArrayList<String>();
		if (level == 0) {
			optionList.add(Level1.OPT_1.toString());
		} else if (level == 1) {
			switch (option) {
			case (1):
				optionList.add(Level11.OPT_11_1.toString());
				optionList.add(Level11.OPT_11_2.toString());
				optionList.add(Level11.OPT_11_3.toString());
				optionList.add(Level11.OPT_11_4.toString());
				System.out.println("Which service you want?");
				break;		
				

			}
		}
		else if(level==2) {
			switch(option) {
				
			case(1):
			optionList.add(Level11_1.OPT_11_1_1.toString());
			optionList.add(Level11_1.OPT11_1_2.toString());
			optionList.add(Level11_1.OPT_11_1_3.toString());
			optionList.add(Level11_1.OPT11_1_4.toString());
			break;
			
			
			case(2):
			optionList.add(Level11_2.OPT11_2_1.toString());
			optionList.add(Level11_2.OPT11_2_2.toString());
			optionList.add(Level11_2.OP11_2_3.toString());
			optionList.add(Level11_2.OPT11_2_4.toString());
			break;
			
			case(3):
			optionList.add(Level11_3.OPT11_3_1.toString());
			optionList.add(Level11_3.OPT11_3_2.toString());
			optionList.add(Level11_3.OPT11_3_3.toString());
			optionList.add(Level11_3.OPT11_3_4.toString());
			break;
			}
		}
		
		return optionList;
	
	}
}