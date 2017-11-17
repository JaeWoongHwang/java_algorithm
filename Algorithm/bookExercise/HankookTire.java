package bookExercise;

public class HankookTire extends Tire {
	// Field
	// Constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	// Method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ¼ö¸í : " + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire ÆãÅ© ***");
			return false;
		}
	}
}
