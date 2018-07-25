package icehs.science.chapter06;

public class Studendt {
	String name;
	String stuID;
	int korScore;
	int engScore;
	int matScore;
	double avg;
	
	void calculateAVG() {
		avg = (double)(korScore+engScore+matScore)/3;
		System.out.println(avg);
	}
	
	void printStudentInfo() {
		System.out.println("학생명 : " +name);
		System.out.println("학번 : " + stuID);
		System.out.println("국어 성적 : " + korScore);
		System.out.println("영어 성적 : " + engScore);
		System.out.println("수학 성적 : " + matScore);
	}

	void changeStudentID(String newStuID) {
		stuID = newStuID;
	}
}
