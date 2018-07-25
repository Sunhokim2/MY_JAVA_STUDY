package icehs.science.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;//속성들
	
	public void moveElevator() {
		System.out.println("엘리베이터를 " + totalFloor + "층만큼 운행합니다.");
	}//method들
	
	public void changeAddress(String newAddress) {
		address = newAddress;
	}//method

}
