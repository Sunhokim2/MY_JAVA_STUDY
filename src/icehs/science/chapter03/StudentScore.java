package icehs.science.chapter03;

public class StudentScore {

	public static void main(String[] args) {
		double math = 94.7;
		double english = 83.2;
		double korea = 87.1;
		
		int intmath = (int)math;
		int intenglish = (int)english;
		int intkorea = (int)korea;
		
		System.out.println("수학 : " + intmath);
		System.out.println("영어 : " + intenglish);
		System.out.println("국어 : " + intkorea);
	}

}
