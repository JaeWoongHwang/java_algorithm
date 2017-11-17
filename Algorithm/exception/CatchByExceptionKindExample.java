package exception;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("There is lack of the execution parameter");
			System.out.println("[Execution method]");
			System.out.println("java.CatchByExceptionKindExample num1 num2");
		} catch (NumberFormatException e) {
			System.out.println("Can not convert to numbers");
		} finally {
			System.out.println("Please execute again");
		}

	}

}
