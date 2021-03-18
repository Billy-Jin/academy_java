package ch07;

//AirPlane 클래스를 상속받고 초음속 비행기능을 추가 탑재한 클래스
public class SuperSonicAirPlane extends AirPlane {
	void test() {
		System.out.println("test()안의"+super.model);
	}
}
