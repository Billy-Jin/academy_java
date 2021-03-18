package ex01.before;

//매직넘버를 (기호)상수로 치환
//매직넘버란? 소스코드에 특정한 값에 속하는 숫자
//이 클래스는 크루즈를 제어하는 기능을 가진 클래스이다 가정..

class CruiseControl{
	
	//field
	private double targetSpeedKmh;
	
	
	//method
	
	void setPreset(int speedPreset) {
		if(speedPreset==2) {
		setTargetSpeedKmh(10940);
		}else if(speedPreset==1){
		setTargetSpeedKmh(10040);	
		}else if(speedPreset==0){
		setTargetSpeedKmh(15040);
		}
	}
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh=speed;
		System.out.println(targetSpeedKmh+"으로 목표 속도가 설정완료");
	}
	
	
}

public class beforeCruiseControl {

	public static void main(String[] args) {
		CruiseControl cruise = new CruiseControl();
		cruise.setPreset(2);
		cruise.setPreset(1);
		cruise.setPreset(0);
	}
}
