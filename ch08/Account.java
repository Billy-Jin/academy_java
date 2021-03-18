package ch08;

public class Account {
	private long balance;//잔고
	
	//생성자
	public Account() {}
	
	//잔고조회
	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int money) {
		balance += money;
	}
	
	//출금
	public void withDraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족"+(money-balance)+" 모자랍니다");
		}
			balance-= money;	
		
		
	}
	
}
