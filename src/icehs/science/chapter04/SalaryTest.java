package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int salary = 1000000;
		int yearSalary = salary * 12;
		int bonus = salary * 4 * 20 / 100;//이거 뭐 어쩌란거야
		int salaryTax = (salary * 12) / 10;
		int bonusTax = (bonus * 11) / 200;
		int resultSalary = yearSalary - salaryTax;
		int resultBonus = bonus - bonusTax;
		
		System.out.println("연봉 : " + yearSalary + ", 세후 연봉 : " + resultSalary);
		System.out.println("보너스 : " + bonus + ", 세후 보너스 : " + resultBonus);
		System.out.println("지급액 : " + (resultSalary + resultBonus));

	}

}
