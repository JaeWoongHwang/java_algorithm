package interfaceExample;

public class ActionExample {

	public static void main(String[] args) {
		// 익명구현 객체
		// 익명구현 객체는 소스파일을 만들지 않고도 구현객체를 만드는 방법
		// 인터페이스 변수 = new 인터페이스() { 인터페이스에 선언된 추상메소드의 실체메소드 선언}
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다");
			}
		};
		action.work();
	}

}
