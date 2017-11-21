package programmers;

import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String str) {
		// Convert String to char
		char[] arr = str.toCharArray();
		char[] desc = new char[arr.length];
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			desc[i] = arr[arr.length - 1 - i];
		}
		// Convert char to String
		String result = String.valueOf(desc);
		return result;
	}
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println(rs.reverseStr("Zbcdefg"));
	}

}
