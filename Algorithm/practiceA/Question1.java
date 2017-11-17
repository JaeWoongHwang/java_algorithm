package practiceA;

public class Question1 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		String[] answer = new String[n];

		int[] finArr = new int[n];
		String[] binary = new String[n];
		String[] binFor1 = new String[n];
		String[] binFor0 = new String[n];

		for (int i = 0; i < arr1.length; i++) {
			finArr[i] = arr1[i] | arr2[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			binary[i] = Integer.toBinaryString(finArr[i]);
			while (binary[i].length() < n) {
				binary[i] = '0' + binary[i];
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < binary[i].length(); j++)
				binFor1[i] = binary[i].replace("1", "#");

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < binFor1[i].length(); j++)
				binFor0[i] = binFor1[i].replaceAll("0", " ");

		}

		for (int i = 0; i < n; i++) {
			answer[i] = binFor0[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.println(binFor0[i]);
		}
	}

}
