package samsung;

import java.util.Scanner;

public class LadderExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variable definition
		int tc = 0;
		int s = 0;
		int spot = 0;
		int[][] lad = new int[100][100];

		// Input data
		tc = scan.nextInt();
		for (int i = 0; i < 99; i++) {
			for (int j = 0; j < 99; j++) {
				lad[i][j] = scan.nextInt();

			}
		}

		// Search requirement
		for (int i = 99; i > 0; i--) {
			for (int j = 99; j > 0; j--) {
				while (lad[i][j] != lad[0][j]) {

					if (lad[99][j] == 2) {
					}
					continue;
				}
			}
		}
	}
}