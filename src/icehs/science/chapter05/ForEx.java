package icehs.science.chapter05;

public class ForEx {

	public static void main(String[] args) {
		int sum=0;
		for(int in =1;in<=100;in++) {
			sum += in;
			System.out.println(sum);//i는 for문 안에서만 사용가능
		}
		System.out.println(sum);
	}

}
