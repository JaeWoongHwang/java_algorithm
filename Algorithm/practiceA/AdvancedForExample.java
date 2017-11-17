package practiceA;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = new int[5];

		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;

		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("Total Value = " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("Average Value = " + avg);
	}

}
