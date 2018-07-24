package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sum =0;
		int evensum =0;
		int onesum =0;
		
		for(int i =1;i<=1000;i++) {
			sum += i;
			if((i%2)==0) {
				evensum += i;
			}
			else {
				onesum +=i;
			}
		}
		System.out.println("1부터 1000까지의 합 : " + sum);
		System.out.println("1부터 1000까지 짝수들의 합 : " + evensum);
		System.out.println("1부터 1000까지 홀수들의 합 : " + onesum);

	}

}
