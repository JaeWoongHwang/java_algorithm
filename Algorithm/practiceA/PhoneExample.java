package practiceA;

import java.util.Scanner;

public class PhoneExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String phone = scan.nextLine();
		char[] phNum = phone.toCharArray();
		// char[] phNum = toCharArray(phone);

		for (int i = 0; i < phNum.length; i++) {

			if (i < phNum.length - 4) {
				phNum[i] = '*';

			}
		}
		for (int i = 0; i < phNum.length; i++) {
			System.out.print(phNum[i]);
		}
	}
}

/*
 * private static char[] toCharArray(String str) { int length = str.length();
 * char[] tmp = new char[length];
 * 
 * int i; for (i = 0; i < length; i++) { tmp[i] = str.charAt(i); } return tmp; }
 * 
 * }
 */