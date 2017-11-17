package exception;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();

		// Deposit
		account.deposit(10000);
		System.out.println("Deposit:" + account.getBalance());

		// Withdraw
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}

	}
}
