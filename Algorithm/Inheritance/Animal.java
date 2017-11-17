package Inheritance;

public abstract class Animal {
	// Field
	public String kind;

	public void breathe() {
		System.out.println("breathe");
	}

	public abstract void sound();
}
