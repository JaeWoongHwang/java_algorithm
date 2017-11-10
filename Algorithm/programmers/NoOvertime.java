package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NoOvertime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		Arrays.sort(works);
		for (int i = 0; i < works.length; i++) {
			if (no % 3 == 0) {
				if (works[i] == works[works.length - 1]) {
					works[works.length - 1] = works[works.length - 1] - (no / 3 + ((no / 3) / 3));
				} else if (works[works.length - 3] == works[works.length - 2]) {
					works[i] = works[i] - (no / 3);
				} else if (works[works.length - 3] != works[works.length - 2]) {
					works[works.length - 2] = works[i] - (no / 3);
					works[works.length - 3] = works[i] - (no / 3 - ((no / 3) / 3));
				}
			} else if (no % 3 != 0) {
				if (works[i] == works[works.length - 1]) {
					works[works.length - 1] = works[works.length - 1] - (no / 3 + no % 3);
				} else {
					works[i] = works[i] - (no / 3);
				}
			}
			result += works[i] * works[i];
		}
		return result;
	}

	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int[] test = { 4, 3, 3 };
		System.out.println(c.noOvertime(4, test));
	}

}
