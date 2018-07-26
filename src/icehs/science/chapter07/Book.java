package icehs.science.chapter07;

public class Book {
	 String title;
	 String author;
	 int price;
	
	Book(){
		
	}
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	Book(String title, int price, String author){
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}//위에꺼다 오버로딩 메소드
	//저런 함수같은 것들이 전부 생성자인가???
	/*
	 * 
	 * 
	 * 
	 **/
	
	void printBookInfo() {
		System.out.println("책 제목 : " + this.title);
		System.out.println("작가명 : " + this.author);
		System.out.println("가격 : " + this.price);
	}
}

