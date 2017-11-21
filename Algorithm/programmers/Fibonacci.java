package programmers;

public class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		long f1 = 0, f2 = 1;
		int n = num - 1;

		while (n > 0) {
			n--;
			answer = f1 + f2;
			f1 = f2;
			f2 = answer;
		}
		return answer;
	}

	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}
