package interfaceExample;

public class MyClass {
	// Field
	RemoteControl rc = new Television();

	// Constructor
	MyClass(RemoteControl rc) {
		this.rc = rc;
	}

	// Method
	void methodA() {
		// Local variable
		RemoteControl rc = new Audio();
	}

	void methodB(RemoteControl rc) {

	}
}
