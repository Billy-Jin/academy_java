package ch07;

//클래스는 RemoteControl인터페이스를 구현하는 구현 클래스이다
/* 참고 
 * 개발 코드가 인터페이스 메소드를 호출하면 -> 인터페이스는 객체의 메소드를 호출
 * 객체는 인터페이스에서 정의한 추상메소드와 동일한 메소드명, 매개타입, 리턴타입을 가진 실체 메서드를 가져야한다.
 * => 이러한 객체를 인터페이스의 구현 객체(implement)라 한다
 * => 구현 객체를 생성하는 클래스를 구현클래스라고 한다
 */
public class TV implements RemoteControl {
	private int volume;
	
	@Override	//실체 메서드
	public void turnOn() { System.out.println("TV의 전원을 켭니다");
		
	}

	@Override	//실체 메서드
	public void turnOff() { System.out.println("TV의 전원을 끕니다");
		
	}

	@Override	//실체메서드
	public void setVolumn(int volume) {
		//필드명=volumn
		if(volume>RemoteControl.MAX_VOLUME) { //최고볼륨보다 큰 경우 예)100->10으로 만들고
			this.volume=RemoteControl.MAX_VOLUME; //this. 찍어야 필드에 있는 값 변경
		}else if(volume<RemoteControl.MIN_VOLUME) { //최저볼륨보다 작을 경우 예)-10->0으로 만들 것이다.
			this.volume=RemoteControl.MIN_VOLUME;
		}else { //정상범주인 경우
			this.volume=volume;//0~10 사이만 가능 
		}
		System.out.println("현재 TV의 Volume="+this.volume);
		
	}

	
	
}
