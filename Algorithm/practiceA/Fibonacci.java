package practiceA;

public class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		
		if (num > 2) {
			answer = (num - 1) + (num - 2);
		} else {
			return 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}

}
