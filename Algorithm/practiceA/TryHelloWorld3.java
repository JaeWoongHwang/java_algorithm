package practiceA;

import java.util.Arrays;

public class TryHelloWorld3 {
	public int getMinSum(int[] A, int[] B) {
		int answer = 0;
		int[] value = new int[B.length];
		// 배열 정렬
		Arrays.sort(A); // 오름차순
		Arrays.sort(B); // 내림차순

		for (int i = 0; i < B.length; i++) {

			value[value.length - 1 - i] = B[i];

		}
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * value[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		TryHelloWorld3 test = new TryHelloWorld3();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
	}

}
