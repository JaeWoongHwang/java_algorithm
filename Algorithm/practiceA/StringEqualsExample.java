package practiceA;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "Eclipse";
		String strVar2 = "Eclipse";

		if (strVar1 == strVar2) {
			System.out.println("strVar1 and strVar2 are have same Reference Value");
		} else {
			System.out.println("strVar1 and strVar2 aren't have same Reference Value");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1 and strVar2 are have same String");

		}

		String strVar3 = new String("Eclipse");
		String strVar4 = new String("Eclipse");

		if (strVar3 == strVar4) {
			System.out.println("strVar3 and strVar4 are have same Reference Value");
		} else {
			System.out.println("strVar3 and strVar4 aren't have same Reference Value");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3 and strVar4 are have same String");

		}

	}

}
