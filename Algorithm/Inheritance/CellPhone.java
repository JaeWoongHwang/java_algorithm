package Inheritance;

public class CellPhone {
	// Field
	String model;
	String color;

	// Constructor

	// Method
	void powerOn() {
		System.out.println("Turn on the power");
	}

	void powerOff() {
		System.out.println("Turn off the power");
	}

	void bell() {
		System.out.println("Ringing a bell");
	}

	void sendVoice(String message) {
		System.out.println("Myself : " + message);
	}

	void receiceVoice(String message) {
		System.out.println("Client : " + message);
	}

	void hangUp() {
		System.out.println("Hang up the phone");
	}
}
