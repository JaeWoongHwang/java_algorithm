package bookExercise;

public class PhoneExample {

	public static void main(String[] args) {
		Phone myPhone = new Phone();

		myPhone.chargeBat(10); // Call Method from Phone

		boolean batState = myPhone.dischargeBat(); // Call Method from Phone

		if (batState) {
			System.out.println("Charging");
			myPhone.run(); // Call 'run' Method from Phone
		}
		if (myPhone.dischargeBat()) {// Call 'dischargeBat' Method from Phone
			System.out.println("No charging require");
		} else {
			System.out.println("Please charge Battery");
		}
	}
}
