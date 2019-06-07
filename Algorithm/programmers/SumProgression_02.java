package programmers;

public class SumProgression_02 {

	public static void main(String[] args) {
		// Sum Progression -1+2-4+7-11 ...
		int i = 0, j = 1, result = -1, count = -1;

		do {
			i++;
			j += i;
			count *= -1;
			result += j * count;
		} while (i < 19);

		System.out.print(result);
	}

}
