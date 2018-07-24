package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int Score = 92;
		
		if((Score>=90) && (Score<=100)) {
			System.out.println("A학점 입니다.");
		}else if((Score>=80) && (Score<90)) {
			System.out.println("B학점 입니다.");
		}else if((Score>=70) && (Score<80)) {
			System.out.println("C학점 입니다.");
		}else if((Score>=60) && (Score<70)) {
			System.out.println("D학점 입니다.");
		}else if((Score>=0) &&(Score<60)){
			System.out.println("F학점 입니다.");
		}else {
			System.out.println("학점을 알 수가 없습니다. 점수를 잘못입력하셨습니다.");
		}
	}

}
