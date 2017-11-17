package Inheritance;

public class Computer extends Calculator {
	// Method redefinition
	@Override
	double areaCircle(double r) {
		System.out.println("Run of areaCircle method that is from the Computer instance");
		return Math.PI * r + r;
	}
}
