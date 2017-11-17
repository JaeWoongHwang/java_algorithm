package bookExercise;

public class Bus {
	// Field
	int speed;

	// Method
	void run() {
		System.out.println("Bus is running " + speed + "km/h");
	}

	public static void main(String[] args) {
		Bus myBus = new Bus();
		myBus.speed = 70;
		myBus.run();
	}

}
