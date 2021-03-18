package ch07;

//이클래스는 RemoteControl인터페이스의 구현 클래스들의 객체를 생성하여 실행하는 클래스
/*인터페이스 구현 객체 사용법
 * 인터페이스 변수;
 * 변수 = 구현객체;
 * 또는
 * 인터페이스 변수=구현객체;
 */
public class RemoteControl_ex01 {

	public static void main(String[] args) {
		RemoteControl rc;//인터페이스 변수
		rc = new TV();//변수=구현객체; => TV객체를 인터페이스타입에 대입
		
		//인터페이스의 turnOn()과 turnOff()호출=>실제 구현은 TV의 실체클래스 TV의 실체메서드가 호출실행
		rc.turnOn();	//TV의 전원을 켭니다.
		rc.setMute(true); //무음처리 합니다.
		rc.turnOff();	//TV의 전원을 끕니다.
		
		rc = new Audio(); 
		//인터페이스의 turnOn()과 turnOff를 호출
		rc.turnOn();		//Audio의 전원을 켭니다.
		rc.setVolumn(-10);	//현재 Audio volume=0
		rc.setVolumn(5);	//현재 Audio volume=5
		rc.turnOff();		//Audio의 전원을 끕니다.
		System.out.println();
		
		//인터페이스에서 정의된 정적매서드 사용
		//인터페이스명.메소드명
			
		RemoteControl.changeBattery(); //Battery 교체
		
		//디폴트 메서드 사용
		//인터페이스타입.매서드명();
		//디폴트 메서드가 실체클래스에서 오버라이딩 되었다면
		//실체객체의 오버라이딩된 매서드가 호출된다.
		rc.setMute(true); //무음처리 합니다.
	}
}
