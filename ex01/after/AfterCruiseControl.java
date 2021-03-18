package ex01.after;

//매직넘버를 (기호)상수로 치환
//매직넘버란? 소스코드에 특정한 값에 속하는 숫자
//이 클래스는 크루즈를 제어하는 기능을 가진 클래스이다 가정..

class CruiseControl{
	
	//field
	private double targetSpeedKmh;
	
	static final int STOP_PRESET = 0; //대문자로 써야함
	static final int NORMAL_PRESET = 1;
	static final int HIGH_PRESET = 2;
	
	//method
	
	void setPreset(int speedPreset) {
		if(speedPreset==HIGH_PRESET) {
		setTargetSpeedKmh(15000);
		}else if(speedPreset==NORMAL_PRESET){
		setTargetSpeedKmh(10000);	
		}else if(speedPreset==STOP_PRESET){
		setTargetSpeedKmh(0);
		}
	}
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh=speed;
		System.out.println(targetSpeedKmh+"으로 목표 속도가 설정완료");
	}
	
	
}

public class AfterCruiseControl {

	public static void main(String[] args) {
		CruiseControl cruise = new CruiseControl();
		cruise.setPreset(2);
		cruise.setPreset(1);
		cruise.setPreset(0);
	}
}
