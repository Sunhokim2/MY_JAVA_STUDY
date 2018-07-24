package icehs.science.chapter04;

public class NumberTest {

	public static void main(String[] args) {
		int data = 10;
		boolean flag = data %2 ==0;
		
		System.out.println("10은 양수 입니까? : " + (data > 0));
		System.out.println("10은 짝수 입니까? : " + flag);
		System.out.println("10은 홀수 입니까? : " + ((data % 2) != 0));
		System.out.println("10은 30보다 큽니까? : " + (data > 30));

	}

}
