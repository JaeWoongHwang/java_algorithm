package programmers;

public class SumProgression {

	public static void main(String[] args) {
		// Sum Progression 1 + 3 + 5 + 7 ...
		int i = 0, j = 1, result = 1;

		do {
			i++;
			j += i;
			result += j;
		} while (i < 19);
		System.out.print(result);
	}

}
