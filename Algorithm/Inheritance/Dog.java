package Inheritance;

public class Dog extends Animal {
	public Dog() {
		this.kind = "mammalia";
	}
	
	@Override
	public void sound(){
		System.out.println("bow-wow");
	}
}
