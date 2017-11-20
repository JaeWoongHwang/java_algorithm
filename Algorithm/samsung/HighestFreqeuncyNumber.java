package samsung;

import java.util.Arrays;
import java.util.Scanner;

public class HighestFreqeuncyNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Field
		int tc = 0;
		int count = 0;
		int max = 0;
		int[] score = new int[1000];
		int[] cnt = new int[1000];

		// Input data
		tc = scan.nextInt();

		for (int i = 0; i < 1000; i++) {
			score[i] = scan.nextInt();
		}
		// Sorting the data
		Arrays.sort(score);

		for (int i = 0; i < 999; i++) {
			for (int j = 0; j < 100; j++) {
				if (score[i] == score[i + 1]) {
					cnt[j]++;
				} else {
					continue;
				}

			}

		}
		for (int i = 0; i < cnt.length; i++) {
			if (max < cnt[i]) {
				max = cnt[i];
			} else {
				continue;
			}
		}

		System.out.println(max);
	}
}
