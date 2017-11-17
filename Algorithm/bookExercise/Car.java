package bookExercise;

public class Car {
	// Field
	String company = "Apple";
	String model;
	String color;
	String cost;

	// Constructor and Set Parameters
	Car() {

	}

	// Car(String model) {
	// this.model = model;
	// }
	//
	// Car(String model, String color) {
	// this.model = model;
	// this.color = color;
	//
	// }
	//
	// Car(String model, String color, String cost) {
	// this.model = model;
	// this.color = color;
	// this.cost = cost;
	// }

	Car(String model) {
		this(model, "Black", "100 dollars");
	}

	Car(String model, String color) {
		this(model, color, "100 dollars");
	}
    // Call constructor
	Car(String model, String color, String cost) {
		this.model = model;
		this.color = color;
		this.cost = cost;
	}
}
