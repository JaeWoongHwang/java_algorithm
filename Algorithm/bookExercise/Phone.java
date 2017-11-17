package bookExercise;

public class Phone {
	// Field
	int bat; // battery

	// Constructor

	// Method
	void chargeBat(int battery) {
		this.bat = bat;
	}

	boolean dischargeBat() {
		if (bat == 0) {
			System.out.println("Please Charge Battery");
			return false;
		}
		System.out.println("Battery remains");
		return true;
	}

	void run() {
		while (true) {
			if (bat > 0) {
				System.out.println("Charging.(Current Battery :" + bat + ")");
				bat -= 1;
			} else {
				System.out.println("Stop Charging.(Current Battery :" + bat + ")");
				return; // Stop Method
			}
		}
	}
}
