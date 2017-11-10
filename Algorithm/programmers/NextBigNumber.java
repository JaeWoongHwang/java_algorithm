package programmers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NextBigNumber {
	public int nextBigNumber(int n) {
		// Set variable
		int answer = 0;
		String bin = "";
		// Transfer Integer to Binary
		bin = Integer.toBinaryString(n);
		// Count the No.1
		Pattern p = Pattern.compile("1");
		Matcher m = p.matcher(bin);
		int count = 0;
		int count2 = 0;

		// Count the number 1
		for (int i = 0; m.find(i); i = m.end()) {
			count++;
		}

		// Search next big number
		for (int i = n + 1; i <= 100; i++) {
			// Transfer Integer to Binary
			String nextBin = "";
			nextBin = Integer.toBinaryString(i);
			Pattern p2 = Pattern.compile("1");
			Matcher m2 = p.matcher(nextBin);

			for (int j = 0; m2.find(j); j = m2.end()) {
				count2++;
				if (count == count2) {
					answer = Integer.parseInt(nextBin);
					break;
				}
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		NextBigNumber test = new NextBigNumber();
		int n = 78;
		System.out.println(test.nextBigNumber(n));
	}

}
