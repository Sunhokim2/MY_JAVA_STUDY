package icehs.science.chapter09;

public class Person {
	private String name;
	private String phoneNo;
	
	public void eat() {
		System.out.println("밥을 먹어요.");
	}
	
}

class Student extends Person{
	private String department;
	
	public void study() {
		System.out.println("공부합니다.");
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("조별로 먹어요.");
	}
}

class Teacher extends Person{
	private String subject;
	
	public void teach() {
		System.out.println("수업을 합니다.");
	}
	
	public void eat() {
		System.out.println("다같이 먹어요.");
	}
}