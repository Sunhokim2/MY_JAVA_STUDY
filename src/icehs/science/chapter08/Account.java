package icehs.science.chapter08;

public class Account {
	String accname;
	String accNo;
	int balance;
	double interestRate;
	
	public Account(String accname, int balance, double interestRate) {
		this.accname = accname;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccname() {
		return accname;
	}

	public String getAccNo() {
		return accNo;
	}

	public int getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestrate) {
		this.interestRate = interestrate;
	}
	
	public int calculateInterest() {
		balance += balance * interestRate/100;
		return balance;
	}
	//
	
	void deposit(int money) {
		if(money<0) {
			System.out.println("[에러]금액은 음수를 입력할 수 없습니다.");
		}else {
		balance += money;
		}
	}
	void withdraw(int money) {
		if(money<0) {
			System.out.println("[에러]금액은 음수를 입력할 수 없습니다.");
		}else if(balance < money){
			System.out.println("[에러]잔액이 부족합니다.");
		}else {
			balance -= money;
		}
	}
	void printAccountInfo() {
		System.out.println("계좌 " + accNo +" (예금주 : " + accname + ")");
		System.out.println("잔액 : " + balance + "원");	
	}
	
	
}
