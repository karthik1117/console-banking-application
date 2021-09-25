import java.util.Scanner;

public class Account {

	String userName;
	String userId;

	Account(String userName, String userId) {
		this.userName = userName;
		this.userId = userId;
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

		} while (option != 'F');
		scanner.close();
		System.out.println("Thank you for banking with us!");
	}

}
