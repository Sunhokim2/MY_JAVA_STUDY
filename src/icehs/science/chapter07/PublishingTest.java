package icehs.science.chapter07;

public class PublishingTest {

	public static void main(String[] args) {
		Publication pub = new Publication();
		
		System.out.println("===== 출판물 정보를 세팅 합니다. =====");
		pub.setTitle("만화 삼국지");
		pub.setPrice(-23);
		pub.setPrice(5000);
		pub.setPage(-34);
		pub.setPage(300);
		pub.printInfo();

	}

}
