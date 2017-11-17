package practiceA;

public class Exercise06 {

	public static void main(String[] args) {
		int[] score = new int[11];

		score[0] = 0;
		score[1] = 70;
		score[2] = 95;
		score[3] = 100;
		score[4] = 85;
		score[5] = 65;
		score[6] = 90;
		score[7] = 80;
		score[8] = 95;
		score[9] = 75;
		score[10] = 100;

		int n = 0;
		int sum = 0;
		int cnt = 0;

		for (n = 1; n <= 10; n++) {

			sum += score[n];
			if (score[n] >= 90) {
				cnt += 1;

			}

		}
		double avg = (double) sum / score.length;
		System.out.println("Total Score = " + sum);
		System.out.println("Average Score = " + avg);
		System.out.println("Score of 90 or more = " + cnt);
	}

}
