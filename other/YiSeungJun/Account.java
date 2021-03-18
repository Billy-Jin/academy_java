package bank;

import java.util.ArrayList;

public class Account {

	protected ArrayList<Account> accList = new ArrayList<Account>();
	final private String ACCNO;
	final private String ACNAME;
	private int balance;

	public Account() {
		this.ACCNO = "";
		this.ACNAME = "";
		this.balance = 0;

		if (accList == null)
			this.accList = new ArrayList<Account>();
	};

	public Account(String accno, String acname, int balance) {
		this.ACCNO = accno;
		this.ACNAME = acname;
		this.balance = balance;
	}

	public void setBalance(int deposit) {
		this.balance = deposit;
	}

	public int getBalance() {
		return this.balance;
	}
	
	public String getACCNO() {
		return this.ACCNO;
	}

	public String getACNAME() {
		return this.ACNAME;
	}

	public Account searchAccount(String accno) {
		Account acc = null;

		for (Account a : this.accList) {
			String acno = (String)a.getACCNO();

			if (acno.equals(accno)) {
				acc = a;
				break;
			}
		}

		return acc; 
	}

}