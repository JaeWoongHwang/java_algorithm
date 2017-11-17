package practiceA;

import java.util.Arrays;

public class ReverseInt {
	public int reverseInt(int n) {
		String str = Integer.toString(n);
		String str1 = "";
		char[] num = str.toCharArray();
		char[] num2 = new char[num.length];

		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			num2[i] = num[num.length - 1 - i];
		}

		for (int i = 0; i < num2.length; i++) {
			str1 += num2[i];
		}
		n = Integer.parseInt(str1);
		return n;
	}

	public static void main(String[] args) {
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));

	}

}
