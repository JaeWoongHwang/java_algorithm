package practiceA;

public class StrToInt {
	public int getStrToInt(String str) {
		int changeInt = 0;
		changeInt = Integer.parseInt(str);
		return changeInt;
	}

	public static void main(String[] args) {
		StrToInt strToInt = new StrToInt();
		System.out.println(strToInt.getStrToInt("-1234"));

	}

}
