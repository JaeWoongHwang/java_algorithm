package practiceA;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] preStrArray = { "Apple", "Amazon", "Google" };
		String[] postStrArray = new String[5];

		System.arraycopy(preStrArray, 0, postStrArray, 0, preStrArray.length);

		for (int i = 0; i < postStrArray.length; i++) {
			System.out.println(postStrArray[i] + ", ");
		}
	}

}
