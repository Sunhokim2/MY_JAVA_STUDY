package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee cof = new Coffee();
		
		cof.name = "아메리카노";
		cof.price = 3500;
		cof.printCoffeeInfo();
		
		Coffee latte = new Coffee();
		
		latte.name = "카페라떼";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee maki = new Coffee();
		
		maki.name = "마키아또";
		maki.price = 4500;
		maki.printCoffeeInfo();
		
		int totalPrice = cof.price + latte.getPrice() + maki.getPrice();
		
		System.out.println("총 금액 : " + totalPrice + "원");

	}

}
