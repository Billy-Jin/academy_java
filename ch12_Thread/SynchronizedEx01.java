package ch12_Thread;

import ch08.BalanceInsufficientException;

//동기화 코드
//여기에서는 열차예매 시스템이라고 가정한 후
// 여러 매표소에서 스래드를 이용해서 좌석을 예매하고
// 현재 잔여 좌석이 1개 남아있을 경우
// 여러 스레드에서 동시에 열차를 예매하는 메소드에 접근 할 수 있다고 가정하자
// => 잔여 좌석은 1개인데 여러 스레드에서 동시에 메소드에 접근해서 예매처리가 된다
//		이런 경우의 작업을 처리할 때는 한 스레드가 메서드에 접근해서 예매 작업을 실행할때에는
// 다른 스레드에서는 해당 메서드에 접근할수 없게 처리하는 작업이 필요하다
// 		==> 이런 작업을 동기화 작업(Synchronized)라고 한다.
public class SynchronizedEx01 {
	
	public static void main(String[] args) {
		Ticket01 tck = new Ticket01();
		Thread tr1 = new Thread(tck,"구매자1");
		Thread tr2 = new Thread(tck,"구매자2");
		
		tr1.start();
		tr2.start();

		
	}
}

//예매작업
class Ticket01 implements Runnable{

	int ticketNum = 10; //잔여좌석수

	@Override
	public void run() {
		for(int i=1; i<=10 ;i++) {//티켓구매 함수호출
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			getTicket();
		}
	}//run
	
	//티켓구매함수
	public synchronized void getTicket() {
	//public void getTicket() {
		ticketNum -=1;
		System.out.print(Thread.currentThread().getName()+" 구매 - ");
		if(ticketNum<=0) {
			System.out.println("잔여 좌석이 없어요!");
			return;
		}
		System.out.println("현재 잔여 좌석수 : "+ticketNum);
	}
}
