package icehs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int hongScore=92;
		int sunScore=85;
		
		if((hongScore>=90)&&(hongScore<=100)) {
			System.out.println("홍길동 : A학점 입니다.");
		}
		else {
			System.out.println("홍길동 : A학점을 받지 못했습니다.");
		}
		
		if((sunScore>=90)&&(sunScore<=100)) {
			System.out.println("홍길순 : A학점 입니다.");
		}
		else {
			System.out.println("홍길순 : A학점을 받지 못했습니다.");
		}

	}

}
