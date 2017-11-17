package Inheritance;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("Hong", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("student number : " + student.studentNo);

	}

}
