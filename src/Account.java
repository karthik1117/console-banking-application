import java.util.Scanner;

public class Account {

	String userName;
	String userId;
	int balance;
	int previousTransaction;

	Account(String userName, String userId) {
		this.userName = userName;
		this.userId = userId;
	}

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	// TODO: se withdraw > amount = mensagem "saldo insuficiente";
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occurred");
		}
	}

	// TODO: perguntar pelo valor de juros.
	void calculateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + " years, you balance will be: " + newBalance);
	}

	public void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, " + userName + "!");
		System.out.println("Your ID is: " + userId);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");

		do {
			System.out.println();
			System.out.println("Enter an option: ");
			char upperOption = scanner.next().charAt(0);
			option = Character.toUpperCase(upperOption);
			System.out.println();

			switch (option) {
				case 'A':
					System.out.println("====================================");
					System.out.println("Balance = $" + balance);
					System.out.println("====================================");
					System.out.println();
					break;
				case 'B':
					System.out.println("Enter an amount to deposit: ");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println();
					break;
				case 'C':
					System.out.println("Enter an amount to withdraw: ");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println();
					break;
				case 'D':
					System.out.println("====================================");
					getPreviousTransaction();
					System.out.println("====================================");
					System.out.println();
					break;
				case 'E':
					System.out.println("Enter how many years of accrued interest: ");
					int years = scanner.nextInt();
					calculateInterest(years);
					break;
				case 'F':
					System.out.println("====================================");
					break;
				default:
					System.out.println("Error: invalid option. Please enter A, B, C, D, or E or access services.");
					break;
			}

		} while (option != 'F');
		scanner.close();
		System.out.println("Thank you for banking with us!");
	}
}
