package samsung;

import java.util.Scanner;

public class CodeScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Feild
		int t = 0;
		int n = 0;
		int m = 0;

		// Input data
		t = scan.nextInt();
		n = scan.nextInt();
		m = scan.nextInt();

		int[][] area = new int[n][m];

		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				area[i][j] = scan.nextInt();
			}

		}

	}
}
