package samsung;

import java.util.Scanner;

public class RobotCleaner {

	public static void main(String[] args) {
		// Variable Definition
		int n = 0;
		int m = 0;
		int r = 0;
		int c = 0;
		int d = 0;
		int count = 0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);

		// Inputting Value
		for (int i = 0; i < 1;) {
			System.out.print("Input 'N' value : ");
			n = scan.nextInt();
			System.out.print("Input 'M' value : ");
			m = scan.nextInt();
			System.out.print("Input 'R' value : ");
			r = scan.nextInt();
			System.out.print("Input 'C' value : ");
			c = scan.nextInt();
			System.out.print("Input 'D' value : ");
			d = scan.nextInt();
			break;

		}
		// Array Definition
		int[][] area = new int[n][m];
		// Inputting value to array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				area[i][j] = scan.nextInt();
			}
		}
		// Check the Array
		// for (int i = 0; i < n; i++) {
		// for (int j = 0; j < m; j++) {
		// System.out.print(area[i][j]);
		// }
		// System.out.println();
		// }

		// for문을 area만큼 돌림. 돌릴 때 처음 위치는 loca위치.
		// 입력받은 d의 값으로 area의 인덱스를 결정
		// 0이면 i의 값이 - / 1이면 j의 값의 + / 2면 i의 값이 + / 3이면 j의 값이 -

		// 탐색방향도 for문을 돌리면서 바꿔야함 하지만 처음엔 무조건 왼쪽
		// 작동 시 처음 조건은 j의 -1 인덱스의 값이 0인지 1인지 판별하는 것
		// if(1) - 0이면 이동(인덱스값 감소 시킴) + count증가
		// else if(2)-1이면 탐색 방향을 바꿈(증가) + 다시 상위 for문으로
		// if(3)-모든 방향에서 이웃한 인덱스 값이 1이면 바라보는 방향을 유지한채(값 고정) 인덱스 -1을 하고 다시 상위
		// for문으로
		// if(4)-네 방향 모두 1일경우 + 기준점의 뒤의 인덱스도 1인경우 break;

		int spot = 0;
		// Number of cases
		switch (d) {
		case 0:
			for (int i = r; i < area.length; i++) {
				for (int j = c; j < area[0].length; j--) {
					spot = area[r][c];
					if (area[r][c - j] == 0) {
						spot = area[r][c - j];
						count++;
					} else if (area[r][c - j] != 0) {
						d++;
						continue;
					}
				}
			}
		case 1:
		case 2:
		case 3:

		}

	}

}
