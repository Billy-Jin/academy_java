package ch07;

//추상클래스- 교재p375
//가상의 상황 전개
//홍길동회원이 빅을 오늘 대여한다.

//(실체)클래스들의 공통적인 특성(필드,매서드)을 추출해서 선언한 클래스
//(실체)클래스: 호랑이, 강아지, 고양이, 곤충, 물고기, 사람
//행동 및 특징 이야기 

public abstract class Animal01 {

	//field
	public String type;
	//constructor
	
	//method - [public|protected] abstract 리턴유형 메소드명(매개변수리스트);
	//추상 method
	public abstract void move();	//움직인다
	public abstract void sound();	//소리낸다
	
	//일반 method
	public void bread() {System.out.println("숨쉬기");} 
}
