package programmers;

import java.util.Scanner;

public class InspectPrimeNum_03 {

	public static void main(String[] args) {
		// Check Prime Numbers Third Type
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number for you want to confirm prime number.");

		// Input number to variable
		int getNum = scan.nextInt();
		int i = (int) Math.sqrt(getNum);
		int j = 2;
		while (true) {
			if (j <= i) {
				if (getNum % j == 0) {
					System.out.print("Not Prime Number");
					break;
				} else {
					j++;
				}
			} else {
				System.out.print("Prime Number");
				break;
			}
		}

	}

}
