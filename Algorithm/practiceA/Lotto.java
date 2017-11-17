package practiceA;

public class Lotto {

	public static void main(String[] args) {
		int preNum = 0;
		int postNum = 0;
		int bonusNum = 0;
		for (int i = 1; i <= 3; i++) {
			preNum = (int) (Math.random() * 45) + 1;
			postNum = (int) (Math.random() * 45) + 1;
			if (preNum != postNum) {
				System.out.println("Pre Number: " + preNum);
				System.out.println("Post Number: " + postNum);
			}

		}
		bonusNum = (int) (Math.random() * 45) + 1;
		if (bonusNum != preNum) {
			if (bonusNum != postNum) {
				System.out.println("Bonus Number: " + bonusNum);
			} else {
				System.out.println("Overlap");
			}
		}
	}

}
