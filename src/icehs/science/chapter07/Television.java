package icehs.science.chapter07;

public class Television {
	String name;
	int price;
	String description;

	public Television(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Television(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	void printTVInfo() {
		if(this.description==null) {
			System.out.println(this.name + " : " + this.price);
		}else {
			System.out.println(this.name + "("+ description + ")"+ " : " + this.price);
		}
	}

	
}
