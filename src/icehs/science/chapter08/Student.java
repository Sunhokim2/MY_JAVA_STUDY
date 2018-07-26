package icehs.science.chapter08;

public class Student {
	private String name;
	private String StuId;
	private String phoneNum;
	
	Student(String name, String StuId, String phoneNum){
		this.name  = name;
		this.StuId = StuId;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public String getStuId() {
		return StuId;
	}

	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void printStudentInfo() {
		System.out.println(name + "(" + StuId + ")/전화번호 : " + phoneNum);
	}
}
