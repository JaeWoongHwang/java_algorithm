package practiceA;

public class HarshadNumber {
	public boolean isHarshad(int num) {
		int sum = 0;
		String strVar = String.valueOf(num);
		char[] charVar = strVar.toCharArray();
		String[] strArray = new String[charVar.length];

		for (int i = 0; i < charVar.length; i++) {
			strArray[i] = String.valueOf(charVar[i]);
		}

		int[] numArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			numArray[i] = Integer.parseInt(strArray[i]);
			sum += numArray[i];
		}
		if (num % sum == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(144));
	}
}
