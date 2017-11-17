package practiceA;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		int max = 0;
		double avg = 0.0;
		int i = 0;
		

		Scanner scr = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("1.Number of Students | 2.Input Score | 3.Score List | 4. Analysis | 5.Exit");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Choice>");

			int selectNo = scr.nextInt();

			if (selectNo == 1) {
				System.out.println("Input Number of Students>");
				studentNum = scr.nextInt();
				System.out.println("Number of Students - " + studentNum);
			} else if (selectNo == 2) {
				System.out.println("Input Scores>");
				scores = new int[studentNum];
				for (i = 0; i < studentNum; i++) {
					System.out.print("score[" + i + "]" + "=");
					scores[i] = scr.nextInt();
				}

			} else if (selectNo == 3) {
				for (i = 0; i < scores.length; i++) {
					System.out.println("score[" + i + "]" + scores[i]);
				}
			} else if (selectNo == 4) {
				for (i = 0; i < scores.length; i++) {
					int num = scores[i];
					if (num >= max) {
						max = num;
					}
				}
				System.out.println("Highest Score> " + max);
				for (i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println("Average Score> " + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("Exit the Program");
	}

}
