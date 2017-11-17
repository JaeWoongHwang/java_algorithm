package practiceA;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] first = new int[n + 1];
		int[] second = new int[n + 1];

		// 입력 값을 배열에 저장
		for (int i = 1; i <= n; i++) {
			first[i] = scan.nextInt();
			second[i] = first[i];
		}
		// 배열 값 중 두번 째 큰 값을 출력
		Arrays.sort(first);
		System.out.println("입력값 = " + n);
		System.out.println("두번째로 큰 값 =" + first[n - 1]);

		for (int i = 1; i <= n; i++) {
			if (second[i] == first[n - 1]) {
				System.out.println("두번째 큰 값의 인덱스 =" + i);
			}
		}
	}

}
