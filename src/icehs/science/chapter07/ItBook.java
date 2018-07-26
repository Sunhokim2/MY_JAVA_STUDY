package icehs.science.chapter07;

public class ItBook {
	private String title;
	private int price;
	private double discountRate;
	
	public ItBook(String title, int price, double discountRate) {
		this.title/*heap에 산다*/ = title;//stack에 산다
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = this.discountRate;
	}
	public void printItBookInfo() {
		System.out.println("제목 : " + title + ", 정가 : " + price + "원, 할인율 : " + discountRate + "%, 할인가 : " + (int)(price - (price*discountRate/100)) + "원");
	}
}  
