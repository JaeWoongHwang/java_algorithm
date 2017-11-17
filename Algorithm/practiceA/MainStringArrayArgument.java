package practiceA;

public class MainStringArrayArgument {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("How to use the Program");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0); // 프로그램 강제 종료
		}
		String strNum1 = args[0];
		String strNum2 = args[1];

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println(result);
	}

}
