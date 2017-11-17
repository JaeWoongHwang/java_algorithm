package bookExercise;

public class Machine {
	// Field
	String model;
	int speed;

	// Constructor
	Machine() {
	};

	Machine(String model) {
		this.model = model;
	}

	// Method
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + " is will be run. (Speed :" + this.speed + "km/h)");
		}
	}

}
