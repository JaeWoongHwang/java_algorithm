package practiceA;

import java.util.Arrays;

public class TryHelloWorld2 {

	public int getMinSum(int[] A, int[] B) {
		int answer = 0;
		// 배열을 정렬
		Arrays.sort(A);
		Arrays.sort(B);
		// 각 배열에서 작은 수 큰수를 곱하기
		// 첫 배열은 i 부터 돌고 두번째 배열은 length -i -1로 돈다

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length - i - 1];

		}

		return answer;

	}

	public static void main(String[] args) {
		TryHelloWorld2 test = new TryHelloWorld2();
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		System.out.println(test.getMinSum(A, B));
	}

}
