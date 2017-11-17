package bookExercise;

public class RectangleExample {

	public static void main(String[] args) {
		Rectangle myRec = new Rectangle();

		// Calculate the width of square
		double result1 = myRec.areaRectangle(10);

		// Calculate the width of rectangle
		double result2 = myRec.areaRectangle(10, 20);

		// Output Result
		System.out.println("THe width of Square = "    + result1);
		System.out.println("THe width of Rectangle = " + result2);

	}

}
