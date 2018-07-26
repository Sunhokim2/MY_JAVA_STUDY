package icehs.science.chapter09;

public class Animal {
	private String kind;
	private int age;
	
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
	
	public void run() {
		System.out.println("달리다...");
	}
}
