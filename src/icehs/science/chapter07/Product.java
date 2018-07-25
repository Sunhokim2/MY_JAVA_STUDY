package icehs.science.chapter07;

public class Product {
	String name;
	int price;
	int discount;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}//생성자는 앞에 'void'나 'int'그런거 없다.
	
	Product(String name, int price, int discount){
		this.name =name;
		this.price = price;
		this.discount = discount;
	}
	
	void printProductInfo() {
		System.out.println("=====" + this.name + "=====");
		System.out.println("정가 " + this.price + "원");
		if(this.discount==0) {
			System.out.println("할인율 : 할인하지 않음");
		}else {
			System.out.println("할인율 : "+ this.discount + "%");
		}//얘는 '메소드'다.
	}
}//이거 전체가 'CLASS'이다.
