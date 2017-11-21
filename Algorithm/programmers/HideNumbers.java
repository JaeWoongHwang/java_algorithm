package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class HideNumbers {

	public static void main(String[] args) {
		// Input number
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		// Change the type
		char[] num = s.toCharArray();

		// Convert the value
		for (int i = 0; i < num.length; i++) {
			for (int j = 4; j > 0; j--) {
				if (i == num.length - j) {
					num[i] = '*';
				}
			}
		}
		// Convert of Character Array to String
		s = String.valueOf(num);
		System.out.println(s);
	}
}