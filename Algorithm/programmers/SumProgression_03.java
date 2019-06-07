package programmers;

public class SumProgression_03 {

	public static void main(String[] args) {
		// Sum Factorial Progression
		int i = 1, j = 1, result = 1;
		do {
			i++;
			j *= i;
			result += j;
		} while (i < 10);

		System.out.print(result);
	}

}
