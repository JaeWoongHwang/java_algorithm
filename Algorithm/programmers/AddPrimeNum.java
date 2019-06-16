package programmers;

import java.util.Scanner;

public class AddPrimeNum {

	public static void main(String[] args) {
		// Add Prime Numbers
		int i = 2, j = 2, result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number");
		int endNum = scan.nextInt();
		while (true) {
			while (i % j != 0) {
				j++;
				if (i == j) {
					result += i;
				}

				if (i < endNum) {
					i++;
				} else {
					System.out.print("Result :" + result);
					break;
				}
			}
		}

	}

}
