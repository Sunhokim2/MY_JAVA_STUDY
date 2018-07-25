package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Studendt hong = new Studendt();
		hong.name = "홍길동";
		hong.stuID = "S001";
		hong.korScore = 94;
		hong.engScore = 80;
		hong.matScore = 89;
		
		hong.changeStudentID("STU0001");
		
		hong.printStudentInfo();
		hong.calculateAVG();
	}

}
