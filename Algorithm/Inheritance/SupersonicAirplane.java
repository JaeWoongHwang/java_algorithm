package Inheritance;

public class SupersonicAirplane extends Airplane {
	// Field definition
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flymode = NORMAL;

	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("Fly Supersonic mode");
		} else {
			// Calling fly() method from the Airplane instance
			super.fly();
		}
	}
}
