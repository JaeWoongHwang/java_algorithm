package programmers;

public class SwitchProgression {

	public static void main(String[] args) {
		// Progression - 1-2+3...+99-100
		int i = 0;
		int j = 0;
		int cnt = 0;

		do {
			i++;
			if (cnt == 0) {
				// Odd Numbers
				j = j + i;
				cnt = 1;
			} else {
				// Even Numbers				
				j = j - i;
				cnt = 0;
			}
		} while (i < 100);

		System.out.print(j);
	}

}
