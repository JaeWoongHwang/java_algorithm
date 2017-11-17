package practiceA;

import java.util.Scanner;

public class BalanceExample {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		boolean run = true;

		int balance = 0;
		int input = 0;
		int output = 0;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.Deposit | 2.Withdraw | 3.Balance | 4.Exit");
			System.out.println("-------------------------------------------");
			System.out.print("Choice the mode>");

			int num = scr.nextInt();

			if (num == 1) {
				System.out.println("Deposit>");
				input = scr.nextInt();
				balance += input;
				System.out.println("Deposit>" + input);
			} else if (num == 2) {
				System.out.println("Withdraw>");
				output = scr.nextInt();
				balance -= output;
				System.out.println("Withdraw>" + output);
			} else if (num == 3) {
				System.out.println("Balance>" + balance);
			} else if (num == 4) {
				run = false;
			}
		}
		System.out.println("-" + "Exit the Program");
	}

}
