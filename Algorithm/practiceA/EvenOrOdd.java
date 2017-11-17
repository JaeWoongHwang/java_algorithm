package practiceA;

public class EvenOrOdd {
	String evenOrOdd(int num) {
		String result = "";
		// Case Even or Odd
		if (num % 2 == 0) {
			return "Even";

		} else if (num % 2 == 1) {
			return "Odd";
		}

		return result;
	}

	public static void main(String[] args) {
		String str = "1 2 3 4";
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
		System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));

	}

}
