package programmers;

import java.util.Scanner;

public class AddPrimeNum {

	public static void main(String[] args) {
		// Add Prime Numbers
		int i = 2, j = 2, result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number");
		int endNum = scan.nextInt();
		
		// Occured infinite loop
		while (j <= endNum) {
			if (i % j != 0) {
				j++;
			} else {
				if (i == j) {
					System.out.println("Prime Number:" + i);
					result += i;
					continue;
				} else {
					j++;
					continue;
				}
			}
		}
		
		System.out.print("Result :" + result);

	}

}
