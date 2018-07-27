package icehs.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] anis = {
				new Cat("야옹이", 3, "페르시안"),
				new Dog("멍멍이", 2, "시베리안허스키")
		};
		
		for(int i=0;i<anis.length;i++) {
			anis[i].printInfo();
			anis[i].run();
			anis[i].hunt();
			anis[i].play();
			System.out.println();
		}
	}

}
