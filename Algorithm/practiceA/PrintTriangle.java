package practiceA;

public class PrintTriangle {

	public String printTriangle(int num) {

		String result = "";
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				result += "*";
			}
			result += "\n";

			/*
			 * String result = ""; String stars = "*"; for (int i = 0; i < num;
			 * ++i) { result += stars + "\n"; stars += "*";
			 */
		}

		return result;
	}

	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println(pt.printTriangle(3));

	}

}
