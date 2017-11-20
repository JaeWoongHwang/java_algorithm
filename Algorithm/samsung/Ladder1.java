package samsung;

import java.util.Scanner;

public class Ladder1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Field
		int testCase = 0;
		int temp = 0;
		int[][] ladder = new int[100][100];
		int[][] flag = new int[100][100];
		int x[] = { 0, -1, 0 };
		int y[] = { -1, 0, 1 };

		// Input test case
		while (temp < testCase) {
			testCase = scan.nextInt();
			for (int i = 99; i > 0; i--) {
				for (int j = 99; j > 0; j--) {
					ladder[i][j] = scan.nextInt();
					flag[i][j] = ladder[i][j];

					if (ladder[99][j] == 2) {

					}
				}
			}
		}
	}
}
