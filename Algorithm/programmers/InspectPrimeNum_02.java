package programmers;

import java.util.Scanner;

public class InspectPrimeNum_02 {

	public static void main(String[] args) {
		// Check Prime Numbers Second Type
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number for you want to confirm prime number.");
		int testNum = scan.nextInt();
		int i = 2;

		while (true) {

			if (testNum % i != 0) {
				i++;
			} else {
				if (testNum == i) {
					System.out.println("Prime Number");
					break;
				} else {
					System.out.println("Not Prime Number");
					break;
				}
			}

		}
	}

}
