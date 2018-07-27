package icehs.science.chapter10;

public class CarTest {

	public static void main(String[] args) {
		/*Car taxi = new Taxi();
		Car truck = new Truck();*/
		
		Car[] cars = {
				new Taxi(),
				new Truck()
		};
		
		
		
		((Taxi)cars[0]).setMaxNum(4);
		
		cars[0].go(20);
		cars[0].setOilSize(10);
		System.out.println("연료 : " + cars[0].getOilSize());
		System.out.println("택시정원 : " +((Taxi)cars[0]).getMaxNum());
		
		cars[0].wash();
		
		cars[1].go(30);
		cars[1].setOilSize(10);
		System.out.println("연료 : " + cars[1].getOilSize());
		((Truck)cars[1]).setMaxWeight(100);
		System.out.println("트럭 최대 적재량 : " +((Truck)cars[1]).getMaxWeight());
		
		cars[1].wash();

	}

}
