package icehs.science.chapter06;

public class InstanceHelpEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		//int balanceAfterDeposit = account.deposit(10000);
		//System.out.println(balanceAfterDeposit);
		
		Account worry = new Account();
		
		int balance = worry.getbalance();
		System.out.println(balance);

	}

}
