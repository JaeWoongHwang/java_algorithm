package bookExercise;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y);
        double result = sum /2;
        return result;
	}
	void execute() {
		double result = avg(7,10);
		println("result : " + result);
		
	}
	void println(String message){
		System.out.println(message);
	}
}
