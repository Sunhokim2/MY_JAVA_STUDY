package icehs.science.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car ice = new Car();
		ice.carName = "ICE카";
		ice.oilAmount = 5;
		ice.distance = 140;
		
		ice.printCarInfo();
		ice.addOil(10);
		ice.printCarInfo();
		ice.drivecar("IT센터", "인천공항", 10.17);
		ice.printCarInfo();
		ice.drivecar("인천공항", "곤지암리조트", 60.21);
		ice.printCarInfo();
		ice.calculateDistance();
	}

}
