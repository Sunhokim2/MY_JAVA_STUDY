package icehs.science.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television("INFINIA", 1500000);
		Television tv2 = new Television("XCANVAS", 1000000, "LCD TV");
		Television tv3 = new Television("CINEMA", 2000000, "3D TV");
		
		tv.printTVInfo();
		tv2.printTVInfo();
		tv3.printTVInfo();
		System.out.println("가격의 합 : " + (tv.price + tv2.price + tv3.price));

	}

}
