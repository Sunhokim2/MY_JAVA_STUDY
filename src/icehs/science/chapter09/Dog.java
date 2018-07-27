package icehs.science.chapter09;

public class Dog extends Animal{
	
	public Dog(String name, int age, String kind) {
		super(name, age, kind);
	}
	@Override
	public void run() {
		System.out.println("시속40킬로로 뛴다");
	}
	@Override
	public void hunt() {
		System.out.println("순록잡기");
	}
	
	@Override
	public void play() {
	}
	
}
