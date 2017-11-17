package exception;

public class TryCatchFinallyException {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("Class is not exit");

		}

	}

}
