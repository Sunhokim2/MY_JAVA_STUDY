package icehs.science.chapter09;

public class Cat extends Animal {
	
	public Cat(String name,int age, String kind) {
		super(name, age, kind);
	}

	
	@Override
	public void run() {
		System.out.println("달려라!!!!");
	}
	
	@Override
	public void hunt() {
		System.out.println("쥐를 잡을거시다.");
	}
	
	public void play() {
		System.out.println("모빌놀이가 좋습네다.");
	}
}
