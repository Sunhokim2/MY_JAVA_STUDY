package icehs.science.chapter07;

import icehs.science.chapter06.Car;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		Car c1 = new Car();
		System.out.println(c1.carName);
	
		Book book2 = new Book("해리포터", 15000);
		
		Book book3 = new Book("칼의 노래", "김훈");
		
		Book book4 = new Book("바람의 딸 한비야", 39200, "한비야");
		
		book1.printBookInfo();
		book2.printBookInfo();
		book3.printBookInfo();
		book4.printBookInfo();
		
	}

}
