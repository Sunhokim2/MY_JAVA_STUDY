package icehs.science.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building sunin = new Building();
		
		sunin.name = "선인고등학교";
		sunin.address = "도화동";
		sunin.totalFloor = 4;
		
		System.out.println("건물명 : " + sunin.name);
		System.out.println("주소 : " + sunin.address);
		System.out.println("전체 층 수 : " + sunin.totalFloor);
		
		sunin.moveElevator();
		sunin.changeAddress("도화로");
		
		System.out.println("새 주소 : " + sunin.address);
		
		Building inha = new Building();
		
		inha.name = "인하여자고등학교";
		inha.address = "인화동";
		inha.totalFloor = 5;
		
		System.out.println();
		System.out.println("건물명 : " + inha.name);
		System.out.println("주소 : " + inha.address);
		System.out.println("전체 층 수 : " + inha.totalFloor);
		
		inha.moveElevator();
		inha.changeAddress("인백로");
		
		System.out.println("새 주소 : " + inha.address);
	}

}
