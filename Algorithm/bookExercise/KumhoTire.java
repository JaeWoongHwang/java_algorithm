package bookExercise;

public class KumhoTire extends Tire {
	// Field
	// Constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// Method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ¼ö¸í : " + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire ÆãÅ©***");
			return false;
		}
	}
}
