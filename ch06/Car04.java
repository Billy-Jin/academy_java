package ch06;

//this - 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어있음
/*참고.
 * 인스턴스(instance) 멤버란 객체(인스턴스)를 생성한후 
 * 사용할 수 있는 필드와 메소드를 말한다.
 * 이들을 각각 인스턴스 필드, 인스턴스 메소드라고 부른다
 * 인스턴스 필드와 메소드는 객체에 소속된 멤버이기 때문에 객체없이는 사용할 수 없다.
 * 
 * 객체외부에서 인스턴스 멤버에 접근하기 위해 참조변수를 사용하듯이
 * 객체내부에서 인스턴스 멤버에 접근하기 위해 this를 사용한다.
 * 에) this.필드명	this.메소드명()
 */
public class Car04 {
	//field -[접근제어자][속성] 데이터타입 변수명[=초기값] 접근제어자=중요데이터로 접근을 제어 할 때 사용
	String model;
	int speed;
	
	//constructor -[접근제어자] 클래스명(매개변수리스트){}
	Car04(){}

	Car04(String m){
		this.model=m;
		//필드명이 매개변수명과 동일하다면
		//필드명이 매개변수로 인식되므로
		//필드명 앞에 this를 많이 붙여 사용한다.
	}
	
	
	//method - [접근제어자][속성]리턴유형 함수명(매개변수리스트){}
	void setSpeed(int speed){
		this.speed=speed;
	}
	
	void run() {
		for(int i=10;i<=50;i+=10) {
		this.setSpeed(i); //setSpeed(10) 만 붙여도 동일
		//객체내부에서 인스턴스 멤버에 접근하기위해 this를사용.
		
		System.out.println(model+"달립니다.(시속:"+this.speed+"km/h)");
		}
	} //아무것도 없을때 void 넣는다.
	
	

}
