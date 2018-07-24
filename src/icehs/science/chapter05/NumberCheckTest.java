package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int num1=2;
		int num2=3;
		int num3=4;
		int num4=5;
		int num5=23;
		int num6=96;
		
		/*
		 * 참고로 한자리 수부터 따지는 것보다 큰 자리수 부터 따지는게 더 편리하다.
		*/
		
		int twoThree = 2*3;
		int foFive = 4*5;
		int cross = 23* 96;
		int minus = 4* -3;
		
		int result = twoThree;
		/*
		 * 이 result는 좀 더 편하게 코드작성을 하게 해준다. result의 값만 바꾸면 된다.
		 * */
		if((result<10)&&(result>0)) {
			System.out.println(num1 + "*" + num2 + " : 한 자리 수입니다.");
		}else if(result<100 &&(result>0)) {
			System.out.println(num1 + "*" + num2 +" : 두 자리 수입니다.");
		}else if(result>=100 &&(result>0)) {
			System.out.println(num1 + "*" + num2 +" : 세 자리 수 이상입니다.");
		}else if(result<0) {
			System.out.println(num1 + "*" + num2 + " : 음수는 확인하지 않습니다.");
		}else {}
		
		result = foFive;
		
		if((result<10)&&(result>0)) {
			System.out.println(num3 + "*" + num4 + " : 한 자리 수입니다.");
		}else if(result<100 &&(result>0)) {
			System.out.println(num3 + "*" + num4 +" : 두 자리 수입니다.");
		}else if(result>=100 &&(result>0)) {
			System.out.println(num3 + "*" + num4 +" : 세 자리 수 이상입니다.");
		}else if(result<0) {
			System.out.println(num3 + "*" + num4 + " : 음수는 확인하지 않습니다.");
		}else {}
		
		result = cross;
		
		if((result<10)&&(result>0)) {
			System.out.println(num5 + "*" + num6 + " : 한 자리 수입니다.");
		}else if(result<100 &&(result>0)) {
			System.out.println(num5 + "*" + num6 +" : 두 자리 수입니다.");
		}else if(result>=100 &&(result>0)) {
			System.out.println(num5 + "*" + num6 +" : 세 자리 수 이상입니다.");
		}else if(result<0) {
			System.out.println(num5 + "*" + num6 + " : 음수는 확인하지 않습니다.");
		}else {}
		
		result = minus;
		
		if((result<10)&&(result>0)) {
			System.out.println(num3 + "*" + -num2 + " : 한 자리 수입니다.");
		}else if(result<100 &&(result>0)) {
			System.out.println(num3 + "*" + -num2 +" : 두 자리 수입니다.");
		}else if(result>=100 &&(result>0)) {
			System.out.println(num3 + "*" + -num2 +" : 세 자리 수 이상입니다.");
		}else if(result<0) {
			System.out.println(num3 + "*" + -num2 + " : 음수는 확인하지 않습니다.");
		}else {}	
	}
}
