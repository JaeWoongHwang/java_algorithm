package practiceA;

public class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;

		for (int i = 2; i <= n; i++) {
			int check = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = 1;
					break;
				}
				
			}
			if (check == 0) {
				result += 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(633));

	}

}
