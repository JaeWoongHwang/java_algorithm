package bookExercise;

public class Television {
	static String company = "Samsung";
	static String model = "OLED";
	static String info;

	// Static Block
	static {
		info = company + "-" + model;
	}

}
