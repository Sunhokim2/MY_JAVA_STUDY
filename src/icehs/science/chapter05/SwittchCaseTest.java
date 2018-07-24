package icehs.science.chapter05;

public class SwittchCaseTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 40;
		int num4 = 70, num5 = 80;
		
		double importance60 = (double)num1 * num2 /2 * 60 / 100;
		double importance13 = (double)(num3 + num4) / 2 * 13 /100;
		double importance27 = (double)num5 * 27 / 100;
		double result = (double)importance60 + importance13 + importance27;

	}

}
