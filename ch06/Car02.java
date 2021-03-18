package ch06;

/* 클래스 구성 멤버
 * 1.field : 객체의 데이터가 저장되는 곳
 * [접근제어자] [속성] 데이터타입 변수명
 
 * 2.constructor : 객체 생성시 초기화 역할 담담
 * 
 
 * 3.method : 객체의 동작에 해당되는 실행블록
 */

public class Car02 {

	//기능(field)
	String company = "조은자동차";	//회사 //전역변수: 클래스 영역에서 사용할 수 있다.
	//인스턴스 변수 : 인스턴스 생성 후, '참조변수,인스턴스변수명'으로 접근해야한다. 
	String model;//모델
	int maxSpeed;//최고속력
	char color;//색상
	
	static int wheel=4;	//클래스변수.static변수
	//인스턴스 생성없이 '클래스이름.메소드명'으로 접근
	//모든 인스턴스에서 공유되어 지는 값
	
	
	//생성자(constuctor)
	
	//method
	void abc() {
		System.out.println("abc()안에서 접근한 company="+company);
		//company는 전역변수로 선언했으므로 abc()안에서 접근할 수 있다.
	}
	void qwe() {
		System.out.println("qwe()안에서 접근한 company="+company);
	}


}
