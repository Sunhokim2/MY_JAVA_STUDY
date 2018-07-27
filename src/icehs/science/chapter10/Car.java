package icehs.science.chapter10;

public class Car implements Washer{
	private int oilSize;

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	
	public void go(int distance) {
		System.out.println( distance + "km 이동합니다.");
	}

	@Override
	public void wash() {
		System.out.println("세차합니다.");
		
	}
}

class Taxi extends Car{
	private int maxNum;

	public int getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	
	@Override
	public void go(int distance) {
		System.out.println("택시를 타고 " + distance + "km이동합니다.");
	}
	
}




