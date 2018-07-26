package icehs.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.setName("고양이");
		c1.setAge(14);
		c1.setKind("페라리안");
		
		System.out.println("이름 : " + c1.getName());
		System.out.println("나이 : " + c1.getAge());
		System.out.println("종류 : " + c1.getKind());
		c1.run();
		c1.hunt();
		c1.play();
		

	}

}
