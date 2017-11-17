package exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		changeLaptop(laptop);
		
		Desktop desktop = new Desktop();
		changeLaptop(desktop);
	}
	
	public static void changeLaptop(Computer computer){
	/*	if(computer instanceof Laptop){
		Laptop laptop = (Laptop)computer;
	}*/
	}

}

class Computer{}
class Laptop extends Computer{}
class Desktop extends Computer{}