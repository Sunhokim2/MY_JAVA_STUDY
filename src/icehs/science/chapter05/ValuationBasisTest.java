package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 40;
		int num4 = 50, num5 = 80;
		
		double importance60 = (double)num1 * num2 /2 * 60 / 100;
		double importance13 = (double)(num3 + num4) / 2 * 13 /100;
		double importance27 = (double)num5 * 27 / 100;
		double result = (double)importance60 + importance13 + importance27;
		
		System.out.println("평가 점수 : " + result);
		
		if((result>0) &&(result<80)) {
			System.out.println("Special Class 입니다!!");
		}else if(result<85) {
			System.out.println("Gold Class 입니다!!");
		}else if(result<90) {
			System.out.println("Silver Class 입니다!!");
		}else if(result<95) {
			System.out.println("Bronze Class 입니다!!");
		}else if(result<=100) {
			System.out.println("Member 입니다!!");
		}else {}

	}

}
