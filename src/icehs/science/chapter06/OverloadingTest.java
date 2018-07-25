package icehs.science.chapter06;

public class OverloadingTest {

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		
		overloading.addition(1000,365);
		overloading.addition(4.5, 24);
		overloading.addition("ANT", "AND");
	}

}
