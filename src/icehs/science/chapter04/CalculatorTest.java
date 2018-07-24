package icehs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int first = 20;
		int second = 7;
		int multiply = first * second;
		int divide = first/second;
		int remainder = first % second;
		
		System.out.println("덧셈 결과 : " + (first + second));
		System.out.println("뺄셈 결과 : " + (first - second));
		System.out.println("곱셈 결과 : " + multiply);
		System.out.println("나눗셈 결과 : " + divide);
		System.out.println("나머지 : " + remainder);
	}

}
