package ch06;

public class Car06 {
	//field [접근제어자][속성] 데이터타입 변수명;
	int speed;
	static String company = "비싼자동차";
	
	//constructor [접근제어자] 클래스명(매개변수리스트){}
	
	//method [접근제어자][속성] 리턴함수 메소드명(매개변수리스트){}
	void run() {//인스턴스 메서드
		System.out.println("run()호출성공");
	
	}
	
	public static void main(String[] args) {
		//인스턴스멤버를 사용하기 위해서는 먼저 인스턴스를 생성해야 한다.
		System.out.println("~~");
		Car06 car=new Car06();
		
		/*운송수단 > 차 > 버스
		 *운송수단 > 차 > 트럭
		 *운송수단 > 기차
		 *운송수단 > 비행기
		 */
		System.out.println(car.speed);
		car.speed = 1000;
		System.out.println(car.speed);
		car.run();
		//static멤버는 클래스명.변수명, 클래스명.메소드명();
		//static메소드 안에서는 static메소드만을 사용
		System.out.println(company);
	}
		
}
