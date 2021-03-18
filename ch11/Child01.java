package ch11;
//Parent01클래스를 상속받는 자식클래스
public class Child01 extends Parent01 {
	//m1()상속받은 상태
	//m2()상속받은 상태
	
	public void m3() {
		System.out.println("자식클래스Child01의 m3()");
	}
	@Override
	public void m2() {
		System.out.println("자식클래스Child01에서 오버라이딩한 m2()");
	}
}
