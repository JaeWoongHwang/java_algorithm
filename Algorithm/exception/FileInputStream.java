package exception;

public class FileInputStream implements AutoCloseable {
	private String file;

	public FileInputStream(String file) {
		this.file = file;
	}

	public void read() {
		System.out.println("Read to " + file);
	}

	@Override
	public void close() throws Exception {
		System.out.println("Close to " + file);
	}
}
