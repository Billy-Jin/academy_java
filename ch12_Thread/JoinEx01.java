package ch12_Thread;

import java.util.ArrayList;

//join()
/*스레드를 여러개 동시에 실행 할 때는
 * 어떤 스레드가 실행될지 정확히 제어하기 힘들다.
 * 따라서 특정한 스레드가 전부 실행된 후에 다른 스레드가 실행되게 하려면 일정한 처리를 해야한다.
 * 이럴 때 사용하는 메서드가 join().
 * join() : join()메서드를 호출한 스레드 작업이 모두 끝날때 까지 
 * 			다른 스레드가 대기하게 하는 기능을 제공
 */

//이 예제에서는 객체 2개를 생성후 동시에 실행
//join을 적용하기 않은 멀티 스레드
public class JoinEx01 {
	
	public static ArrayList<String> carList = new ArrayList<String>();
	
	public static void main(String[] args) {
		BeforeThread bt = new BeforeThread("비포스레드");
		AfterThread at = new AfterThread("애프터스레드");
		try {
			bt.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

		at.start();
		
	}
}//-class JoinEx01-----------------------------------------------------


//목록에 자동차명을 추가
class BeforeThread extends Thread{
	
	public BeforeThread(String name) {
		super(name);
	}

	//목록에 자동차명을 추가
	private void addCar() {
		System.out.println("addCar() 진입");
		JoinEx01.carList.add("차1");
		JoinEx01.carList.add("자동차2");
		JoinEx01.carList.add("자동차3");
		JoinEx01.carList.add("자동차4");
		JoinEx01.carList.add("자동차5");
	}
	
	@Override
	public void run() {

			//public statinc Thread currentThread() : 현재 실행중인 스레드의 이름 
			System.out.println(currentThread().getName()+"의 진입성공");
			try {
				sleep(1000);//300밀리초동안 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			addCar();

		
		
	}
}//-class BeforThread-----------------------------------------------------

//자동차명 목록 출력
class AfterThread extends Thread{

	public AfterThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName()+"의 run()호출성공");
		ArrayList<String> carList = JoinEx01.carList;
		for(int i=0;i<JoinEx01.carList.size();i++) {
			System.out.println(carList.get(i));//자동차목록출력
		}
	}
	
}//-class AfterThread-----------------------------------------------------
