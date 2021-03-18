package test;

public class Account1 {
	
		//field
		String acc;//계좌번호
		String name;//계좌소유자명	
		int money;//잔고
		
		//constructor
		//Account(){}
		
		
		//setter & getter
		void setAcc(String acc) {
			this.acc=acc;
		}
		String getAcc() {
			return acc;
		}
		
		void setName(String name) {
			this.name=name;
		}
		String getName() {
			return name;
		}
		void setMoney(int money) {
			this.money=money;
		}
		int getMoney() {
			return money;
		}
	}

	class test1{
		public static void main(String[] args) {
			Account1 a = new Account1();
		a.setAcc("111-111");
		a.setName("강아지");
		a.setMoney(100000);
		
		System.out.printf(a.getAcc(),a.getName(),a.getMoney());
		
			
			
		}
	}

