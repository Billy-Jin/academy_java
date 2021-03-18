package test.jinwooram;

public class Account {
	
	//filed [접근제어자][속성] 데이터타입 변수명[=초기값]
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	private int balance;
	
	//[접근제어자][속성] 리턴함수 메소드명 (매개변수리스트);
	//
	void setBalance(int balance) {
		if(MAX_BALANCE>=balance&&MIN_BALANCE<=balance) {
		this.balance=balance;
		}
	}

	public int getBalance() {	
	return this.balance;
	}

}
