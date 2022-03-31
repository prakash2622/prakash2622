import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args) {
		BankAccount obj = new BankAccount("Prakash", "4321");
		obj.showMenu();

	}
}

class BankAccount {

	BankAccount(String customerName, String customerId) {
		this.customerName = customerName;
		this.customerId = customerId;
	}

	int balance;
	int previousTransaction;
	String customerName;
	String customerId;

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdrow(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited : " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrow : " + Math.abs(previousTransaction));
		} else {
			System.out.println("No Transaction Occured");
		}
	}

	void showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome..! " + customerName + "\nYour Id is : " + customerId);
		System.out.println();

		int option;
		do {
			System.out.println("1-Check Your Balance");
			System.out.println("2-Deposit");
			System.out.println("3-Withdrow");
			System.out.println("4-Previous Transaction");
			System.out.println("5-Exit \n");
			System.out.print("Enter Your Option : ");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("*-----**-----**-----**-----**-----**-----**-----*");
				System.out.println("Balance = " + balance);
				System.out.println("*-----**-----**-----**-----**-----**-----**-----*");
				break;
			case 2:
				System.out.print("Enter an amount to deposit :");
				int amount1 = sc.nextInt();
				deposit(amount1);
				System.out.println("*-----**-----**-----**-----**-----**-----**-----*");
				getPreviousTransaction();
				System.out.println("*-----**-----**-----**-----**-----**-----**-----*");
				break;
			case 3:
				System.out.print("Enter an amount to withdrow :");
				int amount2 = sc.nextInt();
				withdrow(amount2);
				System.out.println("*-----**-----**-----**-----**-----**-----**-----*");
				getPreviousTransaction();
				System.out.println("*-----**-----**-----**-----**-----**-----**-----*");
				break;
			case 4:
				System.out.println("*-----**-----**-----**-----**-----**-----**-----*");
				getPreviousTransaction();
				System.out.println("*-----**-----**-----**-----**-----**-----**-----*");
			}

		} while (option < 5);
		System.out.println("Thankyou for using our services....");

	}
}