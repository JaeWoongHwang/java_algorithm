package practiceA;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Week today = null; // 열거 타입 변수 선언

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("Today's Day -" + today);

		if (today == Week.SUNDAY) {
			System.out.println("On Sunday, You should go to gym.");
		} else {
			System.out.println("On weekdays, You have to study Java.");
		}
	}

}
