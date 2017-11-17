package Inheritance;

public class Student extends People {
	// Field
	public int studentNo;

	// Constructor
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
