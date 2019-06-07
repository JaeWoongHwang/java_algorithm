package programmers;

public class SumProgression_04 {

	public static void main(String[] args) {
		// Sum Fibonacci numbers
		int i = 1, j = 1, sum = 1, result = 2, count = 2;
		while (true) {
			sum = i + j;
			result += sum;
			count++;
			if (count < 20) {
				i = j;
				j = sum;
			} else {
				break;
			}
		}
		System.out.print(result);
	}
}
