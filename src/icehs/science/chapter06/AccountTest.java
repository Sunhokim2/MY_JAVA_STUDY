package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account hong = new Account();
		hong.accname = "홍길동";
		hong.accNo = "123-456789";
		hong.balance = 10000;
		hong.printAccountInfo();
		
		System.out.println("20000원을 입금합니다.");
		hong.deposit(20000);
		System.out.println("잔액 : " + hong.balance + "원");
		System.out.println("-20000원을 입금합니다.");
		hong.withdraw(-20000);
		System.out.println("잔액 : " + hong.balance + "원");
		System.out.println("-20000원 출금합니다.");
		hong.withdraw(-20000);
		System.out.println("잔액 : " + hong.balance + "원");
		System.out.println("45000원 출금합니다.");
		hong.withdraw(45000);
		System.out.println("잔액 : " + hong.balance + "원");
		}
	}
