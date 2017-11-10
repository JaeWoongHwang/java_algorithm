package programmers;

public class Caesar {
	String caesar(String s, int n) {
		// Set value
		String result = "";
		String lowerCase[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };

		String upperCase[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };

		String[] transfer = new String[lowerCase.length];
		for (int i = 0; i < lowerCase.length; i++) {
			transfer[i] = "0";

		}
		// Character Array to String Array
		char charArray[] = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			transfer[i] = String.valueOf(charArray[i]);
		}

		// Compare Alphabet
		for (int i = 0; i < lowerCase.length; i++) {
			for (int j = 0; j < upperCase.length; j++) {
				if (transfer[i].equals(lowerCase[j])) {
					transfer[i] = lowerCase[(j + n) % 26];
					break;
				} else if (transfer[i].equals(upperCase[j])) {
					transfer[i] = upperCase[(j + n) % 26];
					break;
				}

			}
		}

		// Inputting value
		for (int i = 0; i < s.length(); i++) {
			result += transfer[i];
		}

		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 26));
	}
}