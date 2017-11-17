package practiceA;

import java.util.Scanner;

public class StringArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str[] = new String[30];

		while (scan.hasNextLine()) {
			for (int i = 0; i <= 20; i++) {
				str[i] = scan.nextLine();
				System.out.println(str);
			}
			scan.close();

		}

	}
}