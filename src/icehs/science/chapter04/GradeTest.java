package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int test = 75;
		boolean aGrade = 90 <= test && test <= 100;
		boolean bGrade = 80 <= test && test <= 89;
		boolean cGrade = 70 <= test && test <= 79;
		boolean dGrade = 60 <= test && test <= 69;
		
		
		
		System.out.println("A학점 : " + aGrade);
		System.out.println("B학점 : " + bGrade);
		System.out.println("C학점 : " + cGrade);
		System.out.println("D학점 : " + dGrade);

	}

}
