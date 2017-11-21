package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GetMinMaxString {
	public String getMinMaxString(String str) {
		// Variable definition
		String max = "";
		String min = "";
		String result = "";
		// String array definition
		String[] strArray = new String[str.length()];
		// Use the split
		strArray = str.split("\\s");
		Arrays.sort(strArray);

		min = strArray[0];
		max = strArray[strArray.length - 1];
		
		result += min;
		result += " ";
		result += max;

		return result;
	}

	public static void main(String[] args) {
		String str = "1 2 3 4";
		GetMinMaxString minMax = new GetMinMaxString();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
	}
}
