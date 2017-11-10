package programmers;

public class NextBigNumberExample {
	public int nextBigNumberExample(int n) {
		// Field definition
		int answer = 0;
		String num = "";
		String nextNum = "";
		int cntNum = 0;
		int cntNextNum = 0;

		// Transfer Integer to Binary
		num = Integer.toBinaryString(n);

		// Transfer String to Char Array
		char[] binArray = num.toCharArray();

		for (int i = 0; i < binArray.length; i++) {
			if (binArray[i] == '1') {
				// Count
				cntNum++;
			}
		}

		// Search next big number
		int i = n;
		while (cntNum != cntNextNum) {
			++i;
			cntNextNum = 0;
			nextNum = Integer.toBinaryString(i);
			char[] binArray2 = nextNum.toCharArray();
			for (int j = 0; j < binArray2.length; j++) {
				if (binArray2[j] == '1') {
					cntNextNum++;
				}
			}
		}
		answer = i;
		return answer;
	}

	public static void main(String[] args) {
		NextBigNumberExample test = new NextBigNumberExample();
		int n = 78;
		System.out.println(test.nextBigNumberExample(n));
	}
}
