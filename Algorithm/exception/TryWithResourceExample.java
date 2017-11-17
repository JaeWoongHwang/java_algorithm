package exception;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.text")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Execute code of exception handling");
		}
	}
}
