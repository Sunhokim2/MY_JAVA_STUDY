package icehs.science.chapter10;

public class Animal {
	private String kind;
	private int age;
	private String name;
	
	public Animal(int age, String kind) {
		this.age = age;
		this.kind= kind;
	}
	
	public Animal(String name, int age, String kind) {
		this.kind = kind;
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("종류 : " + getKind());
	}
	
	public void run() {
		System.out.println("달리다...");
	}
	
	public void hunt() {
		System.out.println("쥐를 잡는다.");
	}
	
	public void play() {
		System.out.println("놀라");
	}
}
