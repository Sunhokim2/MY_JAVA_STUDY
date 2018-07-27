package icehs.science.chapter10;

public class MoblieTest {
	public static void main(String[] args) {
		Moblie[] mob = {
				new Galaxy(),
				new IPhone()
		};
		
		mob[0].setProduction("Galaxy");
		mob[0].osVersion("안드로이드 오레오");
		mob[0].call(5);
		mob[0].charge(30);
		
		mob[1].setProduction("iPhone");
		mob[1].osVersion("흰색");
		mob[1].call(10);
		mob[1].charge(15);
		
		}
		
	}
