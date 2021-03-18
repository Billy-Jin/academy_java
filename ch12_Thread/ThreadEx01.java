package ch12_Thread;

public class ThreadEx01 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread("나의 스레드");// 괄호 안에 값을 넣으면 해당값이 Thread-0 를 대신 들어간다
		//이름을 제시하지 않으면Thread-0, Thread-1,... 이런식윽으로 이름이 자동으로 만들어 진다
		myThread.start();//myThread를 시작시키는 부분
		//start()메서드를 호출 하면 새로운 callback을 할당 받고
		//Runnable상태가 되었다가
		//스레드 스케쥴러에 의해서 선택되면
		//Running상태가 되면서
		//해당 스레드의 run()가 실행된다.
	}
}

//Thread 클래스를 상속받아서 생성하기
class MyThread extends Thread{
	public MyThread() { }
	public MyThread(String name) { super(name);	}

	@Override
	public void run() {
		for(int i=1; i<=20;i++) {
			//public statinc Thread currentThread() : 현재 실행중인 스레드의 이름 
			System.out.print(currentThread().getName());
			try {
				sleep(300);//300밀리초동안 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("run()~");//현재 실행중인 스레드의 이름 가져오기
			
			System.out.println();//줄 바꿈
		}
		
	}	
}