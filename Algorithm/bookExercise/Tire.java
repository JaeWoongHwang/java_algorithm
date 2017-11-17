package bookExercise;

public class Tire {
	// Field
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	// Constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// Method
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ¼ö¸í" + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("***" + location + "Tire ÆãÅ© ***");
			return false;
		}
	}
}
