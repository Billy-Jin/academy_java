package ch07;

public class Audio implements RemoteControl {
	private int volume;
	private boolean mute; //디폴트메서드 오버라이드하면서 사용하게 되는 필드를 선언
	
	@Override	//실체 메서드
	public void turnOn() { System.out.println("Audio의 전원을 켭니다");
		
	}

	@Override	//실체 메서드
	public void turnOff() { System.out.println("Audio의 전원을 끕니다");
		
	}

	@Override	//실체메서드
	public void setVolumn(int volume) {
		//필드명=volume
		if(volume>RemoteControl.MAX_VOLUME) { //최고볼륨보다 큰 경우 예)100->10으로 만들고
			this.volume=RemoteControl.MAX_VOLUME; //this. 찍어야 필드에 있는 값 변경
		}else if(volume<RemoteControl.MIN_VOLUME) { //최저볼륨보다 작을 경우 예)-10->0으로 만들 것이다.
			this.volume=RemoteControl.MIN_VOLUME;
		}else { //정상범주인 경우
			this.volume=volume;//0~10 사이만 가능 
		}
		System.out.println("현재 Audio의 Volume="+this.volume);
		
	}

	//디폴트메서드는 인터페이스의 모든 구현객체가 가지고 있는 기본 메소드
	//하지만 필요시 오버라이딩 할수 있다.

	@Override
	public void setMute(boolean mute) {
		//RemoteControl.super.setMute(mute);
		this.mute=mute; //이객체의 mute필드의 값을 변경
		if(mute) { // mute가 true라면
			System.out.println("Audio를 무음처리합니다");
		}else {
			System.out.println("Audio의 음소거를 해제합니다");
		}
	}

	
}
