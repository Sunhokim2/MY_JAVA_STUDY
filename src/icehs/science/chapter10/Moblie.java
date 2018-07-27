package icehs.science.chapter10;

public class Moblie {
	private String production;
	private int price;
	int charge;
	
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void color(String color) {
		System.out.println(production + " : " + color);
	}
	
	public void osVersion(String osVersion) {
		System.out.println(production + " : " + osVersion);
	}
	
	public void call(int time) {
		System.out.println(production+ " : " +time + "분 통화했습니다.");
	}
	
	public void charge(int time) {
		System.out.println(production + " : " + time + "분 충전했습니다.");
	}
}
