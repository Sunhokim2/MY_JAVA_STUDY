package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "홍길동";
		String inyear = "2002";
		int nowyear = 2018;
		int employedDuration = nowyear - Integer.parseInt(inyear);
		
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + inyear);
		System.out.println("근무년수 : " + employedDuration ); 

	}

}
