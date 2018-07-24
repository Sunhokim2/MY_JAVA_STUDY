package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int num = 64;
		boolean isjjak = num%2 == 0;
		boolean isthird = num%3 == 0;
		boolean isseven = num%7 == 0;
		boolean isJjak_And_Seven = isjjak && isseven;
		boolean isJjak_Or_Seven = isjjak || isseven;
		
		System.out.println("짝수입니까? : " + isjjak);
		System.out.println("3의 배수입니까? : " + isthird);
		System.out.println("2의 배수이면서 7의 배수입니까? : " + isJjak_And_Seven);
		System.out.println("2의 배수이거나 7의 배수입니까? : " + isJjak_Or_Seven);

	}

}
