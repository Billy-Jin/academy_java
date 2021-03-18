package ch07;

//AirPlane클래스를 상속받고 초음속 비행기능을 추가 탑재한 클래스
//super : 부모클래스의 멤버주소가 저장되어 있는 참조주소
//참고 this:자기 자신의 참조주소

public class SuperSonicAirPlane_ex01 {

	public static void main(String[] args) {
		SuperSonicAirPlane SAP = new SuperSonicAirPlane();
		SAP.takeoff();
		SAP.fly();
		SAP.land();
		SAP.test();
	}
}
