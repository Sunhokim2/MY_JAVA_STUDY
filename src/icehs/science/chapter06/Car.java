package icehs.science.chapter06;

public class Car {
	int oilAmount;
	double distance;
	String carName;
	
	void addOil(int oil) {
		oilAmount += oil;
		System.out.println("휘발유 10L 주유합니다.");
	}
	
	void printCarInfo() {
		System.out.println("[" + carName + "~] 남은 기름양 : " + oilAmount + "L, 총 주행거리 : " + distance + "km");
	}//차의 상태를 나타내는 메서드
	
	void drivecar(String start, String end, double driveDistance) {
		System.out.println(start + "에서 " + end + "까지 " + driveDistance +"km 주행하였습니다.");
		distance += driveDistance;
		oilAmount-= driveDistance / 20;
	}//출발지, 목적지, 그 거리를 받아서 계산
	
	void calculateDistance() {
		System.out.println("주행 가능한 거리는 약 " + (double)oilAmount*20 + "km 입니다.");
	}//남은 기름으로 갈 수 있는 거리 찾아보는 메서드
}
