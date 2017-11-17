package bookExercise;

import java.util.Scanner;

public class BankApplication {
	// Array definition for Save the BankAccount instance
	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("1. Create Account | 2. Account list | 3. Deposit | 4. Withdraw | 5. Exit");
			System.out.println("----------------------------------------------------------------------------");
			System.out.print("Choice >");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("[Exit the program]");
	}

	// Method definition
	private static void createAccount() {
		System.out.println("[Create Account]");
		System.out.print("Account number :");
		String ano = scan.next();
		System.out.print("Account owner :");
		String owner = scan.next();
		System.out.print("Initial deposit amount :");
		int balance = scan.nextInt();

		BankAccount account = new BankAccount(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("Result : Your account is created");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("[Account List]");
		for (int i = 0; i < accountArray.length; i++) {
			BankAccount account = accountArray[i];
			if (accountArray[i] != null) {
				System.out.print(account.getAno());
				System.out.print("   ");
				System.out.print(account.getOwner());
				System.out.print("   ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	private static void deposit() {
		System.out.println("[Deposit]");
		System.out.print("Account number : ");
		String ano = scan.next();
		System.out.print("Deposit : ");
		int money = scan.nextInt();

		BankAccount account = findAccount(ano);
		if (account == null) {
			System.out.println("Result : Could not found your account");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("Result : Your deposit is succeeded");
	}

	private static void withdraw() {
		System.out.println("[Withdraw]");
		System.out.print("Account number : ");
		String ano = scan.next();
		System.out.print("Withdraw : ");
		int money = scan.nextInt();

		BankAccount account = findAccount(ano);
		if (account == null) {
			System.out.println("Result : Could not found your account");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("Result : Your withdraw is succeeded");
	}

	// Looking for the same account at BankAccount array
	private static BankAccount findAccount(String ano) {
		BankAccount account = null;

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbano = accountArray[i].getAno();
				if (dbano.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}