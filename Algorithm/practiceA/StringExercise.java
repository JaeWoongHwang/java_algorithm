package practiceA;

import java.util.Scanner;

public class StringExercise {
	String getMiddle(String word) {

		char[] getM = word.toCharArray();
		String result = "";
		if (word.length() % 2 == 1) {
			result += getM[(word.length() / 2)];
		} else {
			result += getM[(word.length() / 2) - 1];
			result += getM[(word.length() / 2)];
		}

		return result;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		StringExercise se = new StringExercise();
		System.out.println(se.getMiddle("test"));
	}

}
