package Inheritance;

public class ComputerExample {

	public static void main(String[] args) {
		// Field
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("Circle area : " + calculator.areaCircle(r));
		System.out.println();

		// Calling the redifined method
		Computer computer = new Computer();
		System.out.println("Circle area : " + computer.areaCircle(r));

	}

}
