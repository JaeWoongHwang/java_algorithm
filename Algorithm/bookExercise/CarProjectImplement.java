package bookExercise;

public class CarProjectImplement {

	public static void main(String[] args) {
		// Create CarProject instance
		CarProject car = new CarProject();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
				break;
			
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
				break;
				
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
				break;

			case 4:
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
				break; 

			}
			System.out.println("-------------------------------");
		}

	}

}
