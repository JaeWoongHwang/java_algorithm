package practiceA;

import java.util.Arrays;

public class Divisible {

	public int[] divisible(int[] array, int divisor) {

		int cnt = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % divisor == 0) {
				cnt += 1;
			}

		}
		System.out.println(cnt);
		int[] ret = new int[cnt];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % divisor == 0) {
				ret[j] = array[i];
				j++;

			}

		}
		return ret;
	}

	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array1 = { 5, 9, 7, 10 };
		System.out.println(Arrays.toString(div.divisible(array1, 5)));
	}

}
