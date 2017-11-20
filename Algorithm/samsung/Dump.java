package samsung;

import java.util.Arrays;
import java.util.Scanner;

public class Dump {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Field
		int dumpCount = 0;
		int[] flattern = new int[100];
		int run = 0;
		int index = 0;
		int result = 0;

		// Input data
		while (run < 10) {
			dumpCount = scan.nextInt();
			for (int i = 0; i < flattern.length; i++) {
				flattern[i] = scan.nextInt();
			}
			// Compare of Box height
			for (int i = 0; i < dumpCount; i++) {
				Arrays.sort(flattern);
				flattern[0] += 1;
				flattern[flattern.length - 1] -= 1;
				Arrays.sort(flattern);
				result = flattern[flattern.length - 1] - flattern[0];
			}
			index++;
			System.out.print("#");
			System.out.print(index);
			System.out.print(" ");
			System.out.print(result);
			System.out.println();
		}
	}
}