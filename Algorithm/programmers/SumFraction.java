package programmers;

public class SumFraction {

	public static void main(String[] args) {
		float i = 0, j = 0;

		do {
			i++;
			if (i / 2 == 0) {
				// Even Numbers
				j += i / (i + 1);
			} else {
				// Odd Numbers
				j -= i / (i + 1);
			}
		} while (i < 99);

		System.out.print(j);
	}

}
  