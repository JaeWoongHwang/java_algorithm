package programmers;

public class Collatz {
	public int collatz(int num) {
		int answer = 0;
		int count = 0;
		while (num > 1 || count < 500) {
			if (num % 2 == 0) {
				num = num / 2;
				count++;
			} else if (num % 2 == 1) {
				num = (num * 3) + 1;
				count++;
			}

		}
		answer = count;
		return answer;
	}

	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}

}
