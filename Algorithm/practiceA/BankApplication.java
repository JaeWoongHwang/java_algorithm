package practiceA;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금  | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("[계좌생성]");
		System.out.print("계좌번호 : ");
		String ano = scan.next();
		System.out.print("계좌주 : ");
		String owner = scan.next();
		System.out.print("초기입금액 : ");
		int balance = scan.nextInt();

		Account account = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("게좌가 생성되었습니다.");
				break;
			}
		}

	}

	private static void accountList() {
		System.out.println("[계좌목록]");

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (accountArray[i] != null) {
				System.out.print(account.getAno());
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	private static void deposit() {
		System.out.println("[예금]");
		System.out.print("계좌번호 : ");
		String ano = scan.next();
		System.out.print("예금액 : ");
		int money = scan.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌를 찾지 못했습니다.");
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("예금이 입금되었습니다.");
	}

	private static void withdraw() {
		System.out.println("[출금]");
		System.out.print("계좌번호 : ");
		String ano = scan.next();
		System.out.print("출금액 : ");
		int money = scan.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌를 찾지 못했습니다.");
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("예금이 출금되었습니다.");
	}

	private static Account findAccount(String ano) {
		Account account = null;
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
