package ch12_Thread;

public class ThreadEx02 {

	public static void main(String[] args) {
		YourThread your = new YourThread();
		//Thread(Runnable target, String name)
		Thread yourThread = new Thread(your,"너의쓰레드");// 괄호 안에 값을 넣으면 해당값이 Thread-0 를 대신 들어간다
		//YourThread 클래스 자체가 Thread클래스가 아니므로
		//Thread클래스의 생성자를 이용해서
		//스레드 객체를 생성한다
		yourThread.start();
		
		
		//start()메서드를 호출 하면 새로운 callback을 할당 받고
		//Runnable상태가 되었다가
		//스레드 스케쥴러에 의해서 선택되면
		//Running상태가 되면서
		//해당 스레드의 run()가 실행된다.
	}

}
//Runnable 인터페이스를 구현해서 정의하기 
//Runnable 인터페이스에는 void run() 메서드만이 있다.
//아래의 클래스는 
class YourThread implements Runnable{
	public YourThread() { 	}
	public YourThread(YourThread your, String string) {}
	

		

	@Override
	public void run() {
		for(int i=1; i<=20;i++) {
			//public static Thread currentThread() : 현재 실행중인 스레드의 이름 
			System.out.print(Thread.currentThread().getName());
			try {
				Thread.sleep(300);//300밀리초동안 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("run()~");//현재 실행중인 스레드의 이름 가져오기
			
			System.out.println();//줄 바꿈
		
		}
	}
		
		
}	