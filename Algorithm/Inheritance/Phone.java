package Inheritance;

// Abstract class definition
public abstract class Phone {
	// Field
	public String owner;

	// Constructor
	public Phone(String owner) {
		this.owner = owner;
	}

	// Method
	public void turnOn() {
		System.out.println("Turn on the phone");
	}

	public void turnOff() {
		System.out.println("Turn off the phone");
	}

}
